/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anoop
 *
 */
@RestController
public class OrderController {

	@RequestMapping(value = "/")
	public String home() {
		return "Order Service is available";
	}

	@RequestMapping(value = "api/v1", method = RequestMethod.GET)
	public String getOrders() throws Exception {
		return "orders available";
	}
	
	@RequestMapping(value = "api/v1/{1}", method = RequestMethod.POST)
	public String createOrders(RequestBody request) throws Exception {
		return "creating the order...";
	}
}

