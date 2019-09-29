package com.example.codeLinc6.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
@RestController
@RequestMapping("/distance")
public class DistanceController {

	
	
	@GetMapping("/zip")
	@ResponseBody
	public String getDistance(@RequestParam("zip_code_1") String zipCodeOne, @RequestParam("zip_code_2") String zipCodeTwo){
		
		String url = "https://www.zipcodeapi.com/rest/Qr9TaO93PSJ7t4WV1l0phHREmKD8GhpD1iVQ0lJGYyHt2Yg0HxPOOcZb9cPEM30t/distance.json/" 
		+ zipCodeOne + "/" + zipCodeTwo + "mile";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return result;
	}
	
	
	//Testing method for form posting
	@GetMapping("/test")
	@ResponseBody
	public ArrayList<test> getDistance(@RequestParam("filter") String string){
		ArrayList<test> tmp = new ArrayList<test>();
		tmp.add(new test());
		tmp.add(new test());
		tmp.add(new test());
		tmp.add(new test());
		tmp.add(new test());
		return tmp;
	}
	
	static public class test {
		String name = "HI MY NAME IS ANTHONY";
		
		public String getName() {
			return this.name;
		}
	}
}

