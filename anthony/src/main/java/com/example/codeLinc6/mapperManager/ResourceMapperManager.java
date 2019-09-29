package com.example.codeLinc6.mapperManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

import com.example.codeLinc6.model.*;

import org.springframework.stereotype.Component;

import com.example.codeLinc6.model.Veteran;



/*
 * This is what returns and does CRUD operations such as add resources, get all , delete etc.
 * The "database" obj should be created here i.e. object that is storing our vertens
 */
@Component()
public class ResourceMapperManager {


	
	public ArrayList<Resource>  getResources(String filter) throws IOException{
		TreeMap contactResources = parse("./vets.txt");
		TreeMap tagresources = tag(contactResources.keySet());
		ArrayList keeper = new ArrayList<Resource>();
		String [] filterarr = filter.split(" ");
		return match( new ArrayList<String>(Arrays.asList(filterarr)), tagresources, keeper,contactResources);
	}
		
	
	

		public static TreeMap<String,ArrayList<String>> parse(String filename) throws IOException {
			// Insert filepath here
			String filepath = "/Users/user/Desktop/CodeLinc006/anthony/src/main/java/com/example/codeLinc6/mapperManager/" + filename;
			File file = new File(filepath); 
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			String st; 
			int count = 0;
			TreeMap<String,ArrayList<String>> resources = new TreeMap<String,ArrayList<String>>();
			while ((st = br.readLine())!=null) {
				count++;
				if(count<6) {
					continue;
				}
				if(count>51) {
					break;
				}
				if(!st.contains(".")) {
					continue;
				}
				st = st.replaceAll("\\P{Print}", "...");
				Pattern p = Pattern.compile("\\.{2,}");
				String[] resourceArr = p.split(st);
				String name = resourceArr[0].trim();
				name = name.replaceAll("\n","");
				String contact = resourceArr[1];
				ArrayList<String> empty = new ArrayList<String>();
				resources.putIfAbsent(name, empty);
				((ArrayList<String>) resources.get(name)).add(contact);
			}

			br.close();
			return resources;
		}
		public static TreeMap<String,ArrayList<String>> tag(Set<String> keys) {
			TreeMap<String,ArrayList<String>> ret = new TreeMap<String,ArrayList<String>>();
			ArrayList<String> housing = new ArrayList<String>();
			ArrayList<String> healthcare = new ArrayList<String>();
			ArrayList<String> job = new ArrayList<String>();
			ArrayList<String> education = new ArrayList<String>();
			ArrayList<String> money = new ArrayList<String>();
			housing.add("Home Loans");
			housing.add("Homeless Veterans");
			housing.add("Home Loan Guaranty");

			education.add("Caregiver Support");

			education.add("Education");
			education.add("Vocational Rehabilitation and Employment");
			education.add("Education Benefits");
			education.add("eBenefits");

			money.add("Pension Management Center");
			money.add("Vocational Rehabilitation and Employment");
			money.add("VA Benefit Payment Rates");
			money.add("Life Insurance");
			money.add("Home Loan Guaranty");

			job.add("Vocational Rehabilitation and Employment");
			job.add("Caregiver Support");
			job.add("eBenefits");


			healthcare.add("Veterans Choice Program");
			healthcare.add("Meeting the Unique Needs of Women Veterans");
			healthcare.add("Services for Blind and Visually Impaired Veterans");
			healthcare.add("Veterans Crisis Line");
			healthcare.add("VA Dental Insurance Program");
			healthcare.add("Bereavement Counseling");
			healthcare.add("Civilian Health and Medical Program (CHAMPVA)");
			healthcare.add("Caregiver Support");
			healthcare.add("Health Care");
			healthcare.add("Foreign Medical Program");
			healthcare.add("Homeless Veterans");
			healthcare.add("Telecommunication Device for the Dead (TDD)");
			healthcare.add("Women Veterans");
			healthcare.add("eBenefits");
			healthcare.add("Environmental Exposures");
			healthcare.add("Federal Recovery Coordination Program");
			healthcare.add("Health Care Eligibility");
			healthcare.add("Mental Health");
			healthcare.add("My HealtheVet");

			//federal,healthcare,food,housing,state,money,job,insurance
			for(String org : keys) {
				if(healthcare.contains(org)) {
					ret.putIfAbsent(org, new ArrayList<String>());
					ret.get(org).add("healthcare");
				}
				if(money.contains(org)) {
					ret.putIfAbsent(org,new  ArrayList<String>());
					ret.get(org).add("financial");
				}
				if(job.contains(org)) {
					ret.putIfAbsent(org,new ArrayList<String>());
					ret.get(org).add("job");
				}
				if(housing.contains(org)) {
					ret.putIfAbsent(org,new ArrayList<String>());
					ret.get(org).add("housing");
				}
				if(education.contains(org)) {
					ret.putIfAbsent(org,new ArrayList<String>());
					ret.get(org).add("education");
				}
				else {
					ret.putIfAbsent(org, new ArrayList<String>());
					ret.get(org).add("other");
				}


			}
			return ret;
		}
		public static ArrayList<Resource> match(ArrayList<String> tags, TreeMap<String,ArrayList<String>> resources, ArrayList<Resource> keepers, TreeMap<String,ArrayList<String>> contact) {
			if(resources.keySet().isEmpty()) {
				return(keepers);
			}
			int highest = 0;
			String keep = "";
			ArrayList<String> bestRemove = new ArrayList<String>();
			for(String k:resources.keySet()) {
				ArrayList<String> currRemove = new ArrayList<String>();
				ArrayList<String> vals = resources.get(k);
				int count = 0;
				for(String s:vals) {
					if(tags.contains(s)){
						count++;
						currRemove.add(s);
					}
				}
				if(highest<count) {
					highest = count;
									
					keep = k;
					bestRemove = currRemove;
				}
			}
			if(highest == 0) {
				return(keepers);
			}
			tags.removeAll(bestRemove);
			Resource keepres = new Resource();
			keepres.setName(keep);
			if(keepers.size()%2 == 0)
				keepres.setZip("27206");
				if(keepers.size()%2 != 0)
				keepres.setZip("27708");
			keepres.addContact(contact.get(keep).get(0));
			keepres.addContact(contact.get(keep).get(1));
			keepers.add(keepres);
			resources.remove(keep);
			return(match(tags,resources,keepers,contact));
		}

}