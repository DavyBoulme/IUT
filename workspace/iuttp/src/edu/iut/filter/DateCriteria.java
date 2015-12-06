package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;


/**
 * <b>DateCriteria est l'interface représentant les critères sur la date</b>
 * @author DavyKui
 */
public interface DateCriteria {
	
	//________________METHODES DE LA CLASSE___________________
	/**
     * Création d'une ArrayList à l'aide de la fonction
     * @return ArrayList<Date> créer dans la fonction
     */
	public ArrayList<Date> meetCriteria(ArrayList<Date> dates, Date d);
}
