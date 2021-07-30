package logical_Question;

import java.util.*;

class AppearElementOnceInArray {

	public static void main(String[] args) {
		int[] a = { 5, 3, 4, 5, 2, 3, 4 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int no : a) {
			Integer count = map.get(no);
			if (count == null) {
				map.put(no, 1);
			} else {
				count = count + 1;
				map.put(no, count);
			}
		}

		Set<Map.Entry<Integer, Integer>> es = map.entrySet();
		for (Map.Entry<Integer, Integer> me : es) {
			if (me.getValue() == 1) {
				System.out.println("Given element in array is appear once " + me.getKey());
			}
		}
	}

}
