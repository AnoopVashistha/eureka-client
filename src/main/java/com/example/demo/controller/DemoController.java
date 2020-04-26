/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anoop
 *
 */
@RestController
public class DemoController {

	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}

	@RequestMapping(value = "api/v1/demo", method = RequestMethod.GET)
	public String createTodoList() throws Exception {
		return "demo successful";
	}
}
