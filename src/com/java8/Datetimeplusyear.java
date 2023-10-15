package com.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeplusyear {
	public static void main(String[] args) {
		String dateOfJoin="2015-11-01T10:15:30";
		LocalDateTime date = LocalDateTime.parse(dateOfJoin, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime date1=LocalDateTime.now();
		if(date.plusYears(7).isBefore(date1)){
			System.out.println("hi");
		}
		else System.out.println("bye");
	
	}

}
