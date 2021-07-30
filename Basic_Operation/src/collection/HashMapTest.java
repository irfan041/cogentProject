package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		/*
		 * HashMapDemo hm=new HashMapDemo(101,"Allen"); HashMapDemo hm1=new
		 * HashMapDemo(101,"Allen12e3"); System.out.println(hm.hashCode());
		 * System.out.println(hm1.hashCode());
		 */
		/*
		 * HashMap<HashMapDemo, Integer> hash=new HashMap<HashMapDemo,Integer>();
		 * hash.put(new HashMapDemo(101,"Allen"),101); hash.put(new
		 * HashMapDemo(101,"Allen"),102);
		 */
		HashMap<String, Integer> hash=new HashMap<String,Integer>();
		
		hash.put("Allen",101);
		hash.put("Allen",102);
		System.out.println(hash);
		
		Set<String> s=new HashSet<String>();
		s.add("Allen");
		s.add("Allen");
		System.out.println(s);
		
	}

}
