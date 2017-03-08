package com.techelevator.ssg.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
@SessionAttributes("cart")
public class ShoppingController {
	@Autowired
	ProductDao dao;

	@RequestMapping(path = "/store")
	public String displayHomePage(HttpServletRequest request) {
		request.setAttribute("products", dao.getAllProducts());
		return "storeProducts";

	}

	@RequestMapping(path = "/productDetails", method = RequestMethod.GET)
	public String productDetails(@RequestParam Long id, HttpServletRequest request) {

		request.setAttribute("product", dao.getProductById(id));

		return "productDetails";
	}

	@RequestMapping(path = "/productDetails", method = RequestMethod.POST)
	public String productDetails(ModelMap map, @RequestParam Integer amount, @RequestParam Long id) {
		ShoppingCart cart;
		if (map.containsAttribute("cart")) {
			cart = (ShoppingCart) map.get("cart");

		} else
			cart = new ShoppingCart();
		cart.addProductToCart(dao.getProductById(id), amount);

		map.addAttribute("cart", cart);

		return "redirect:/shoppingCart";
	}
	@RequestMapping(path = "/shoppingCart")
	public String shoppingCartDisplay(ModelMap map) {
		map.addAttribute("cartItems", ((ShoppingCart) map.get("cart")).getCart());
		return "shoppingCart";

	}

}