package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : G�rer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	
	
	/*Qu'est ce qu'un singleton ?*/
	private static ApplicationSession session = null;

	private ApplicationSession() {
		/* Definir US comme locale par d�faut */
		
			
		Locale.setDefault(Locale.US);//On pense que mofifier le locale va modifier la langue
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("IUTTrain");
		sessionGuiLogger.setLevel(Level.ALL); /* Touls les message doivent �tre affich� */
		sessionExceptionLogger = Logger.getLogger("IUTException");/*Logger pour exception*/
		sessionExceptionLogger.setLevel(Level.ALL); /*Tous les messages doivent �tre affich�*/
			
	}
	
	
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		/* r�cup�rer les resources */
		resourceBundle= ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}
	
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	

}
