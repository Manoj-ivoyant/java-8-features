package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterandIterate {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		students.stream().filter(s -> s.getMarks() > 7.5f).forEach(s ->System.out.println( s.getName()));
		//more precise way to filter and fetching data
	}
}