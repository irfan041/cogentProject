package Stringexmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDemo1 {
	private List<Integer> getReadOnlyList(int inputArray[]) {
		List<Integer> myReadOnlyList = new ArrayList<Integer>();
		List<Integer> myIntList = new ArrayList<Integer>();
		for (int i : inputArray) {
			myIntList.add(i);
		}
		myReadOnlyList = Collections.unmodifiableList(myIntList);
		return myReadOnlyList;

	}

	public static void main(String[] args) {
		int inputArray[] = { 10, 23, 34, 45, 56, 67, 45 };
		ArrayDemo1 d = new ArrayDemo1();
		List<Integer> myReadOnlyList = d.getReadOnlyList(inputArray);
		System.out.println(myReadOnlyList);
		try {
			myReadOnlyList.add(245);
			System.out.println(myReadOnlyList);
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}

	}
}
