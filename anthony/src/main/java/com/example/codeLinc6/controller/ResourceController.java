<<<<<<< HEAD
package com.example.codeLinc6.controller;

import java.util.ArrayList;
=======

package com.example.codeLinc6.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
>>>>>>> 73364d97651194b1277529993d2bf01dbfbd50d8
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
>>>>>>> 73364d97651194b1277529993d2bf01dbfbd50d8
import org.springframework.web.bind.annotation.RestController;

import com.example.codeLinc6.mapperManager.ResourceMapperManager;
import com.example.codeLinc6.mapperManager.VeteranMapperManager;
<<<<<<< HEAD
import com.example.codeLinc6.model.ResourceMatcher;
=======
import com.example.codeLinc6.model.Resource;
>>>>>>> 73364d97651194b1277529993d2bf01dbfbd50d8
import com.example.codeLinc6.model.Veteran;

@RestController
@Component
@RequestMapping("/codeLinc6")
public class ResourceController {
	
	//Configure your object to use in order to use
	@Autowired
	ResourceMapperManager resourceMapperManager;
<<<<<<< HEAD
	ResourceMatcher res;
	
	@GetMapping("/test")
	public String adResource( ArrayList<String> tags, TreeMap<String, ArrayList<String>> resources,  ArrayList<String> keepers) {
		
		//You can use the veteran param with the below, to call any methods in it
		
		resourceMapperManager.getResources( res,tags, resources, keepers);//call whatever methods you want
		
		
		return "works";
	}
	
	
	@PostMapping("/veteran")
	public String addResource(@RequestBody ResourceMatcher resource,  ArrayList<String> tags, TreeMap<String, ArrayList<String>> resources,  ArrayList<String> keepers) {
		
		//You can use the veteran param with the below, to call any methods in it
		
		resourceMapperManager.getResources( resource,tags, resources, keepers);//call whatever methods you want
		
		
		return "works";
	}
	
	

}
=======
	
	
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
>>>>>>> 73364d97651194b1277529993d2bf01dbfbd50d8
