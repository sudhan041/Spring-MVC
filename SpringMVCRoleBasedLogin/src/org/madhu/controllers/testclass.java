package org.madhu.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testclass {

	public static void main(String[] args) throws Exception{
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = sdf.format(cal.getTime());
		System.out.println(formatted);
	}

}
