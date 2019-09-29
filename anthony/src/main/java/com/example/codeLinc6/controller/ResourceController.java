
package com.example.codeLinc6.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeLinc6.mapperManager.ResourceMapperManager;
import com.example.codeLinc6.mapperManager.VeteranMapperManager;
import com.example.codeLinc6.model.Resource;
import com.example.codeLinc6.model.Veteran;

@RestController
@Component
@RequestMapping("/codeLinc6")
public class ResourceController {
	
	//Configure your object to use in order to use
	@Autowired
	ResourceMapperManager resourceMapperManager;
	
	
	@GetMapping("/testtt")
	@ResponseBody
	public ArrayList<Resource> adResource(@RequestParam("filter") String callFilter ) throws IOException {
		
		//You can use the veteran param with the below, to call any methods in it
		
		return resourceMapperManager.getResources(callFilter);//call whatever methods you want
//		for (int i = 0; i < retList.size(); i++) {
//			retList.set(i,(retList.get(i) + resources.get(retList.get(i)) + " " + 2))
//		}
		
		//return "works";
	}
	
//	
//	@PostMapping("/veteran")
//	public String addResource(@RequestBody CombinedResources comb,  ArrayList<String> tags) {
//		
//		//You can use the veteran param with the below, to call any methods in it
//		
//		resourceMapperManager.getResources( comb,tags, resources, keepers);//call whatever methods you want
//		
//		
//		return "works";
//	}
	
	

}
