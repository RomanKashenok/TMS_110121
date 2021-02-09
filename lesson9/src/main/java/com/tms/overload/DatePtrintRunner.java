package com.tms.overload;

import java.util.Date;

public class DatePtrintRunner {
	
	public static void main(String[] args) {
		
		DatePrinter dp = new DatePrinter();
		
		dp.printDate("01.01.2015");
		dp.printDate(new Date());
		dp.printDate(1, 1, 2015);
	}
}
