package com.techelevator.ssg.model.store;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

	private Map<Product, Integer> cart = new HashMap<Product, Integer>();

	public void addProductToCart(Product product, Integer amount) {

		cart.put(product, amount);

	}

	public Map<Product, Integer> getCart() {
		return cart;
	}
	

}
