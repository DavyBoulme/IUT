package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;


/**
 * <b> DateCriteriaAfter est la classe représentant les critères sur la date de début</b>
 * @author DavyKui
 */
public class DateCriteriaBefore {

	//________________METHODES DE LA CLASSE___________________	
		/**
	     * Création d'une ArrayList à l'aide de la fonction
	     * @return ArrayList<Date> créer dans la fonction
	     */
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
