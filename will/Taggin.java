package codelincnongit;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taggin {
	public Map<String,ArrayList<String>> tag(Set<String> keys) {
		Map<String,ArrayList<String>> ret = new TreeMap<String,ArrayList<String>>();
		ArrayList<String> housing = new ArrayList<String>();
		ArrayList<String> healthcare = new ArrayList<String>();
		ArrayList<String> job = new ArrayList<String>();
		ArrayList<String> education = new ArrayList<String>();
		ArrayList<String> money = new ArrayList<String>();
		ArrayList<String> other = new ArrayList<String>();
		housing.add("Home Loans");
		housing.add("Homeless Veterans");
		housing.add("Home Loan Guaranty");
		
		education.add("Caregiver Support");
		
		education.add("Education");
		education.add("Vocational Rehabilitation and Employment");
		education.add("Education Benefits");
		
		money.add("Pension Management Center");
		money.add("Vocational Rehabilitation and Employment");
		money.add("VA Benefit Payment Rates");
		money.add("Life Insurance");
		money.add("Home Loan Guaranty");
		
		job.add("Vocational Rehabilitation and Employment");
		job.add("Caregiver Support");
		job.add("eBenefits");5
		
		
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
					else if(money.contains(org)) {
						ret.putIfAbsent(org,new  ArrayList<String>());
						ret.get(org).add("financial");
					}
					else if(job.contains(org)) {
						ret.putIfAbsent(org,new ArrayList<String>());
						ret.get(org).add("job");
					}
					else if(housing.contains(org)) {
						ret.putIfAbsent(org,new ArrayList<String>());
						ret.get(org).add("housing");
					}ss
					else if(education.contains(org)) {
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
	
}
