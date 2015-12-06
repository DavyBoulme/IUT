package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;



/**
 * <b> DateCriteriaAfter est la classe représentant les critères sur la date de fin</b>
 * @author DavyKui
 */
public class DateCriteriaAfter implements DateCriteria{

	//________________METHODES DE LA CLASSE___________________	
	/**
     * Création d'une ArrayList à l'aide de la fonction
     * @return ArrayList<Date> créer dans la fonction
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
