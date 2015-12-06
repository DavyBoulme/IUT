package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;



/**
 * <b> DateCriteriaAfter est la classe repr�sentant les crit�res sur la date de fin</b>
 * @author DavyKui
 */
public class DateCriteriaAfter implements DateCriteria{

	//________________METHODES DE LA CLASSE___________________	
	/**
     * Cr�ation d'une ArrayList � l'aide de la fonction
     * @return ArrayList<Date> cr�er dans la fonction
     */
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
