package com.example.codeLinc6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import com.example.codeLinc6.model.*;
//import java.util.ArrayList;
@SpringBootApplication
<<<<<<< HEAD
@ComponentScan("com.example.CodeLinc6")

=======
@ComponentScan("com.example.codeLinc6.")
>>>>>>> c4f2c8d6ac513ae3069f0390f9ebf560459c125e
public class CodeLinc6Application {

	public static void main(String[] args)
	{
		SpringApplication.run(CodeLinc6Application.class, args);
		
//		com.example.codeLinc6.model.Veteran myVeteran = new com.example.codeLinc6.model.Veteran();
//		
//		myVeteran.setName("James Barksdale Sr.");
//		myVeteran.setBirthdate("06/27/2001");
//		myVeteran.setZip(28277);
//		myVeteran.setSSN("*****3456");
//		myVeteran.setBranch("Marine Corps");
//		
//		myVeteran.setServiceDates("9/28/2019", "9/30/2019");
//		
//		ArrayList<String> myConflicts = new ArrayList<String>();
//		myConflicts.add("Iraq");
//		myConflicts.add("Afghanistan");
//		myVeteran.setConflicts(myConflicts);
//		
//		ArrayList<String> myDisabilities = new ArrayList<String>();
//		myDisabilities.add("PTSD");
//		myVeteran.setDisabilities(myDisabilities);
//		
//		ArrayList<String> myNeeds = new ArrayList<String>();
//		myNeeds.add("Food");
//		myNeeds.add("Clothing");
//		myNeeds.add("Housing");
//		myVeteran.setNeeds(myNeeds);
//		
//		ArrayList<String> myHistory = new ArrayList<String>();
//		myHistory.add("null");
//		myVeteran.setHistory(myHistory);
//		
//		
//		System.out.println("myVeteran.name: " + myVeteran.getName());
//		
//		CaseWorker myCaseWorker = new CaseWorker();
//		
//		myCaseWorker.setName("Sicko Mo Bamba");
//		myCaseWorker.setOrganization("Vet Foundation");
//		ArrayList<Veteran> myVeteranList = new ArrayList<Veteran>();
//		myVeteranList.add(myVeteran);
//		myCaseWorker.setVeteranList(myVeteranList);
//		
//		System.out.println("myCaseWorker.organization: " + myCaseWorker.getOrganization());
	}

}
