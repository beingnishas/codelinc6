//package com.example.codeLinc6.controller;
//
//import java.util.ArrayList;
//import java.util.TreeMap;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.codeLinc6.mapperManager.ResourceMapperManager;
//import com.example.codeLinc6.mapperManager.VeteranMapperManager;
//import com.example.codeLinc6.model.ResourceMatcher;
//import com.example.codeLinc6.model.Veteran;
//
//@RestController
//@Component
//@RequestMapping("/codeLinc6")
//public class ResourceController {
//	
//	//Configure your object to use in order to use
//	@Autowired
//	ResourceMapperManager resourceMapperManager;
//	ResourceMatcher res;
//	
//	@GetMapping("/test")
//	public String adResource( ArrayList<String> tags, TreeMap<String, ArrayList<String>> resources,  ArrayList<String> keepers) {
//		
//		//You can use the veteran param with the below, to call any methods in it
//		
//		resourceMapperManager.getResources( res,tags, resources, keepers);//call whatever methods you want
//		
//		
//		return "works";
//	}
//	
//	
//	@PostMapping("/veteran")
//	public String addResource(@RequestBody ResourceMatcher resource,  ArrayList<String> tags, TreeMap<String, ArrayList<String>> resources,  ArrayList<String> keepers) {
//		
//		//You can use the veteran param with the below, to call any methods in it
//		
//		resourceMapperManager.getResources( resource,tags, resources, keepers);//call whatever methods you want
//		
//		
//		return "works";
//	}
//	
//	
//
//}