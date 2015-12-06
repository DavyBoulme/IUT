package edu.iut.exceptions;


/**
 * <b>IUTException est la classe qui gère les exceptions de l'applications</b>
 * @author DavyKui
 */
public class IUTException extends Exception
{
	//________________METHODES DE LA CLASSE___________________
  /**
   * Constructeur de la classe qui initialise les  exceptions à empty
  */
	public IUTException()
	{
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	
	 /**
	   * Constructeur de la classe 
	   * @param e
	   * 		e est une IUTException qui va afficher un message selon le type d'erreur
	  */
	public IUTException(IUTException e)
	{
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	
	
	/**
	   * Constructeur de la classe 
	   * @param message
	   * 		message est le message retourné pour l'exception
	  */
	public IUTException(String message)
	{
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}