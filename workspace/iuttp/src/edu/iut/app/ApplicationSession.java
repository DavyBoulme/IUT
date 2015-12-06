package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * <b>ApplicationSession est la classe repr�sentant les ApplicationSessions</b>
 * <p>
 * Une ApplicationSeesion est caract�ris� par les attributs suivants :
 * <ul>
 * <li>Un locale qui permet de g�rer la langue</li>
 * <li>Une ressourceBundle sui g�re la langue</li>
 * <li>Des loggers</li>
 * <li>Un tableau de mois</li>
 * <li>Un tableau de jour</li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les �l�ments de la SchedulerFrame avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationSession {
	
	//_______________________LES VARIABLES____________________________________
	 /**
     * Le resourceBundle qui est modifiable dans certaines fonctions
     */
	protected ResourceBundle resourceBundle;
	
	 /**
     * Le locale qui est modifiable dans certaines fonctions
     */
	protected Locale locale;
	
	 /**
     * Les loggers qui est modifiable dans certaines fonctions
     */
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	
	 /**
     * Les tableaux de mois et de jours dans certaines fonctions
     */
	protected String[] months;
	protected String[] days;

	//Singleton de la classe
	private static ApplicationSession session = null;
	
	//_______________________LES METHODES____________________________________
	
	/**
     * Constructeur de la classe qui va initiliser tous les attributs de la classe
     * Elle est d�clarer en private � cause du singleton
     */
	private ApplicationSession() {
		//locale = Locale.getDefault();
		locale.setDefault(locale.FRANCE);
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("IUTTrain");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);
		
		days = new String[7];
		days[0] = getString("monday"); days[1] =  getString("tuesday"); days[2] =  getString("wednesday");
		days[3] = getString("thursday");   days[4] =  getString("friday"); days[5] =  getString("saturday");
		days[6] = getString("sunday"); 
		
		months = new String[12];
		months[0] = getString("january"); months[1] =  getString("february"); months[2] =  getString("march");
		months[3] = getString("april");   months[4] =  getString("may");      months[5] =  getString("june");
		months[6] = getString("july"); months[7] =  getString("august"); months[8] =  getString("september");
		months[9] = getString("october"); months[10] =  getString("november"); months[11] =  getString("december");
		
		
	}
	
	
	/**
     * M�thode qui retourne l'ApplicationSession
     * @return ApplicationSession
     */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	
	/**
     * M�thode qui retourne le sessionGuiLogger
     * @return sessionGuiLogger
     */
	public Logger getGUILogger() 
	{
		return sessionGuiLogger;
	}
	
	
	/**
     * M�thode qui retourne le sessionExceptionLogger
     * @return sessionExceptionLogger
     */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	
	/**
     * M�thode qui initilise le locale et le bundle
     * @param locale
     * 		on initialise le locale de notre classe avec cului qui est pass�e en param�tre
     */
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}
	
	
	/**
     * M�thode qui retourne le ressourceBundle
     * @param key
     * 		key est utilis�e pour retourne le bon reourceBundle
     * @return resourceBundle.getString(key)
     */
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
	/**
     * M�thode qui retourne le tableau de jours
     * @return days
     */
	public String[] getDays() {
		return days;
	}
	
	/**
     * M�thode qui retourne le tableau de mois
     * @return months
     */
	public String[] getMonths() {
		return months;
	}

}
