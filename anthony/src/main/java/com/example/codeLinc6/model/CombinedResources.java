import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import Resource;
public class CombinedResources {
	public static ArrayList<String> parse(filename) throws IOException {
		// Insert filepath here
		String filename = "vets.txt";
		String filepath = "/resources/" + filename;
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
			String name = resourceArr[0];
			String contact = resourceArr[1];
			ArrayList<String> empty = new ArrayList<String>();
			resources.putIfAbsent(name, empty);
			((ArrayList<String>) resources.get(name)).add(contact);
		}
		br.close();
	}
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
					}
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
	public ArrayList<String> match(ArrayList<String> tags, TreeMap<String,ArrayList<String>> resources, ArrayList<String> keepers) {
		if(tags.isEmpty()) {
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
		keepers.add(keep);
		resources.remove(keep);
		return(match(tags,resources,keepers));
	}
	public static void main(String[] args) {
		resources = parse("");
		TreeMap taggedResources = tag(resources.keySet());
		ArrayList tags = new ArrayList<String>({"healthcare","financial","housing"});
		ArrayList matches = match(tags,taggedResources,new ArrayList<String>)
		for(k:matches) {
			System.out.println(k);
		}
	}
}









