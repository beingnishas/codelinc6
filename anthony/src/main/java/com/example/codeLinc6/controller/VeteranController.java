package com.example.codeLinc6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeLinc6.mapperManager.VeteranMapperManager;
import com.example.codeLinc6.model.Veteran;

@RestController
public class VeteranController {
	
	//Configure your object to use in order to use
	@Autowired
	VeteranMapperManager veteranMapperManager;
	
	@PostMapping("/veteran")
	public String addVeteran(@RequestBody Veteran veteran) {
		
		//You can use the veteran param with the below, to call any methods in it
		
		veteranMapperManager.getAll();//call whatever methods you want
		
		
		return "works";
	}

}
