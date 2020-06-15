package com.shinhan.sras.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://192.168.155.6:25111")
@RequestMapping("/")
public class HomeController {

	@GetMapping("")
	public Map<String, Object> home() {

		//Test Code.
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("sras","test");

		return  map;
	}
}
