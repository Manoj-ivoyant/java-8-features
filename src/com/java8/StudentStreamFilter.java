package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamFilter {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		students.forEach(i -> System.out.println(i));
		System.out.println();

		List<Float> marksList = new ArrayList<>();
		marksList = students.stream().filter(s -> s.getMarks() > 7.5f).map(s -> s.getMarks())
				.collect(Collectors.toList());
		// filter=applying operation to filter,map=fetching
		// data,collect=collecting filtered data as a list
		marksList.forEach(i -> System.out.println(i));

	}

}
