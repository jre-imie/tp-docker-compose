package com.imie.count.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count")
public class CountController {
	private int counter = 0;

//	@Autowired
//	private CounterRepository counterRepository;

	@GetMapping
	public int count() {
		return counter++;
	}

//	@GetMapping("db")
//	public long countDb() {
//		Counter c = new Counter();
//		counterRepository.save(c);
//		return c.getId();
//	}
}
