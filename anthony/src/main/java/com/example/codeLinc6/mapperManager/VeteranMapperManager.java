package com.example.codeLinc6.mapperManager;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import com.example.codeLinc6.model.Veteran;


@Component("VeteranMapperManager")
/*
 * This is what returns and does CRUD operations such as add Veteren, get all , delete etc.
 * The "database" obj should be created here i.e. object that is storing our vertens
 */
public class VeteranMapperManager {

	
	
	public ArrayList<Veteran> getAll(){
		return new ArrayList<Veteran>();
	}
}
