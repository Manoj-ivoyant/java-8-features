package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentListToSet {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(23, "misha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		// removes duplicate data i.e line 14
		Set<Float> setMarks = students.stream().filter(s -> s.getMarks() > 7.5f).map(s -> s.getMarks())
				.collect(Collectors.toSet());
		setMarks.forEach(s -> System.out.println(s));
	}

}
