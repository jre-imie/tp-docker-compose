package com.imie.showcount.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class ShowCountController {

	@GetMapping
	public String showCount() {

		RestTemplate restTemplate = new RestTemplate();
		String s = restTemplate.getForObject("http://count-service:8080/count", String.class);
		return s;

	}
}
