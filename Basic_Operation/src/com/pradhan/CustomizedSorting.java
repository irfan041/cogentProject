package com.pradhan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomizedSorting {

	public static void main(String[] args) {
		List<Student> student = Arrays.asList(new Student(11,"raja"),
				new Student(2,"bhaskar"),new Student(30,"mohan"));
				System.out.println("Before Sorting..........");
				System.out.println(student);
				System.out.println("After Sorting... by Name");
				student=student.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
				System.out.println(student);

	}

}
class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
