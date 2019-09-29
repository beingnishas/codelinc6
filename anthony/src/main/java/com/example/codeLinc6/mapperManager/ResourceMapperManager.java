package com.example.codeLinc6.mapperManager;
import java.util.ArrayList;
import com.example.codeLinc6.model.*;

import org.springframework.stereotype.Component;

import com.example.codeLinc6.model.Veteran;

@Component("ResourceMapperManager")
/*
 * This is what returns and does CRUD operations such as add resources, get all , delete etc.
 * The "database" obj should be created here i.e. object that is storing our vertens
 */
public class ResourceMapperManager {

	public ArrayList<ResourceMatcher>  getResources(){
		return new ArrayList<ResourceMatcher>();
	}
}
