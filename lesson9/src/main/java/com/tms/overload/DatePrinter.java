package com.tms.overload;

import java.util.Date;

public class DatePrinter {

	public void printDate(String s) {
		System.out.println("String parameter");
	}

	public void printDate(int day, int month, int year) {
		System.out.println("int int int parameter");
	}

	public void printDate(Date d) {
		System.out.println("Date parameter");
	}

	public void printDate(Object d) {
		System.out.println("Object parameter");
	}
}
