package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentListToMap {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		Map<Integer,String> studentMap=students.stream().collect(Collectors.toMap(s->s.getId(), s->s.getName()));
		System.out.println(studentMap);
		
	}
}
