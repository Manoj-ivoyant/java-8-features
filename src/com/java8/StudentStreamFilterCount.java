package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StudentStreamFilterCount {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		long count=students.stream().filter(s->s.getMarks()>7.5f).count();
		System.out.println(count);
	}

}
