package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortAMap {

	public static void main(String a[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("San Ramon", 94583);
		map.put("Dublin", 94568);
		map.put("Pleasanton", 94588);
		map.put("Danville", 94506);
		map.put("San Jose", 95101);
		map.put("Santa Clara", 95050);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
