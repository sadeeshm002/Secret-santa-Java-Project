package com.demo.learning.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = now.format(formatter);
		
		System.out.println(format);
		
		LocalDate parse = LocalDate.parse("15/10/2025",formatter);
		
		System.out.println(parse);
	}

}
