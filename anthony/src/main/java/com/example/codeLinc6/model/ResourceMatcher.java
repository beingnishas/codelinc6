import java.util.TreeMap;
import java.util.ArrayList;
import basicparser;
import Taggin;
public class ResourceMatcher {
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
}
