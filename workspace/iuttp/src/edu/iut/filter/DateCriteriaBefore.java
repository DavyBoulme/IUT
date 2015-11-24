package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;

public class DateCriteriaBefore {


	public ArrayList<Date> meetCriteria(ArrayList<Date> dates, Date d) {

	      ArrayList<Date> datesBefore = new ArrayList<Date>(); 
	      
	      for (Date date : dates) {
	         if(date.before(d)){
	            datesBefore.add(date);
	         }
	      }
	      return datesBefore;
	}

}
