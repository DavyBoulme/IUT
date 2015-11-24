package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;

public interface DateCriteria {
	public ArrayList<Date> meetCriteria(ArrayList<Date> dates, Date d);
}
