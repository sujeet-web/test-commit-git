package com.testgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/getMessage")
	public String getMessage() {
		return "hello sujeet welcome back...again";
	}

}
