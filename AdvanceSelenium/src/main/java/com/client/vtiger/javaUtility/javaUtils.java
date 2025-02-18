package com.client.vtiger.javaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
public class javaUtils {

		public int getRandomNumber()
		{
			Random ram=new Random();		
			int randomnum = ram.nextInt(5000);
			return randomnum;
		}
		public String getCurrentDateYYYYMMdd()
		{
			Date dateobj=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
			String actDate=sdf.format(dateobj);
			return actDate;
		}
		public String getEndDateYYYYMMdd(int days)
		{
			Date dateobj=new Date();
			SimpleDateFormat simpleDate=new SimpleDateFormat("YYYY-MM-dd");
			simpleDate.format(dateobj);
			Calendar cal=simpleDate.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH,days);
			String endDate=simpleDate.format(cal.getTime());
			return endDate;
		}
	}


