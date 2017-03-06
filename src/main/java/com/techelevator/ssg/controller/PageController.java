package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.calculator.AlienAgeCalculator;
import com.techelevator.ssg.model.calculator.AlienTravelCalculator;
import com.techelevator.ssg.model.calculator.AlienWeightCalculator;


@Controller
public class PageController {

	@RequestMapping("/alienWeight")
	public String displayHomePage() {
		return "alienWeight";
		
	}
	@RequestMapping("/alienWeightResult")
	public String showAlienWeightCalculatorResults(HttpServletRequest request) {
		
		String planetName = request.getParameter("Planet");
		double earthWeight = Double.parseDouble(request.getParameter("earthWeight"));
		
		double results = AlienWeightCalculator.alienCalc(planetName.toUpperCase(), earthWeight);
		request.setAttribute("WeightOnPlanet", results);
		
		return "alienWeightResult";
	}
	@RequestMapping("/alienAge")
	public String showAlienAge() {
		return "alienAge";
	}
	@RequestMapping("/alienAgeResult")
	public String showAlienAgeCalculatorResults(HttpServletRequest request) {
		
		String planetName = request.getParameter("Planet");
		int earthAge = Integer.parseInt(request.getParameter("earthAge"));
		
		double results = AlienAgeCalculator.alienCalc(planetName.toUpperCase(), earthAge);
		results = Math.round(results * 100.0)/100.0;
		request.setAttribute("AgeOnPlanet", results);
		
		return "alienAgeResult";
	}
	@RequestMapping("/alienDriveTime")
	public String showDriveTime() {
		return "alienDriveTime";
	}
	@RequestMapping("/alienDriveTimeResult")
	public String showAlienDriveCalculatorResults(HttpServletRequest request) {
		
		String planetName = request.getParameter("Planet");
		String transportation = request.getParameter("Transportation");

		double results = AlienTravelCalculator.alienCalc(planetName, transportation);
		results = Math.round(results * 100.0)/100.0;
		
		request.setAttribute("driveTime", results);
		
		return "alienDriveTimeResult";
	}
}
