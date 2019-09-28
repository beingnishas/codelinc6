import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.regex.*;
public class basicparser {

	public static void main(String[] args) throws IOException {
		// Insert filepath here
		filepath = ???
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

}

