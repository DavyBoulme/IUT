package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;


public class DateCriteriaAfter implements DateCriteria{

	public ArrayList<Date> meetCriteria(ArrayList<Date> dates, Date d) {

	      ArrayList<Date> datesAfter = new ArrayList<Date>(); 
	      
	      for (Date date : dates) {
	         if(date.after(d)){
	            datesAfter.add(date);
	         }
	      }
	      return datesAfter;
	}

}
