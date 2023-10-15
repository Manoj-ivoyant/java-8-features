package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StudentStreamMaxMin {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24, "asha", 9.9f));
		students.add(new Student(13, "basha", 7.5f));
		students.add(new Student(17, "nisha", 8.9f));
		students.add(new Student(65, "disha", 6.6f));
		//finding max of marks
		Student student=students.stream().max((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1).get();
		System.out.println(student.getName()+" "+student.getMarks());
		System.out.println();
		//finding minimum marks
		Student student1=students.stream().min((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1).get();
		System.out.println(student1.getName()+" "+student1.getMarks());
	}

}
