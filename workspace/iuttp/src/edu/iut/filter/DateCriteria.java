package edu.iut.filter;

import java.util.ArrayList;
import java.util.Date;


/**
 * <b>DateCriteria est l'interface repr�sentant les crit�res sur la date</b>
 * @author DavyKui
 */
public interface DateCriteria {
	
	//________________METHODES DE LA CLASSE___________________
	/**
     * Cr�ation d'une ArrayList � l'aide de la fonction
     * @return ArrayList<Date> cr�er dans la fonction
     */
	public ArrayList<Date> meetCriteria(ArrayList<Date> dates, Date d);
}
