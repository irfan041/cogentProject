package Stringexmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingAccordingValue {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Hi", 1);
		hm.put("Hello", 5);
		hm.put("welcome", 4);
		hm.put("Java", 11);
		hm.put("fine", 9);
		hm.put("Good", 80);
		System.out.println(hm);
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, 
				Integer>>(hm.entrySet());
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Entry e=(Entry) itr.next();
			System.out.println("Errror"+e.getKey()+","+e.getValue());
		}
		ArrayList l1 = new ArrayList();
		System.out.println("data="+l1);
		Collections.sort(list, new MapValueComparetor());
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		System.out.println(temp);
	}
}

class MapValueComparetor implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

		return o1.getValue().compareTo(o2.getValue());
	}

}
