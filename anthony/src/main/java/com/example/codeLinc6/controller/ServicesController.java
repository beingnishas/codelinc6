package com.example.codeLinc6.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
@RestController
@RequestMapping("/services")
public class ServicesController {
	
	//Testing method for form posting
	@GetMapping("/search")
	@CrossOrigin(maxAge = 5000)
	@ResponseBody
	public ArrayList<test> getDistance(@RequestParam("filter") String filter){
		ArrayList<test> tmp = new ArrayList<test>();
		tmp.add(new test(filter));
		return tmp;
	}
	
	static public class test {
		String name = "HI MY NAME IS ANTHONY";
		
		public test(String filter) {
			name = filter;
		}
		
		public String getName() {
			return this.name;
		}
	}
}

