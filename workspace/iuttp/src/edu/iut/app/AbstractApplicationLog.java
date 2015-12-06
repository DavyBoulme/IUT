package edu.iut.app;

import java.util.ArrayList;


/**
 * <b>AbstractApplicationLog est la classe abstraite représentant les applicationlogs</b>
 * <p>
 * Un AbstractApplicationLog est caractérisé par les attributs suivants :
 * <ul>
 * <li>Un message en cas d'exceptions</li>
 * <li>Une ArrayList<IApplicationLogListener> pour gérer les IapplicationLogListeners </li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les élèments de la AbstractApplicationLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public abstract class AbstractApplicationLog implements IApplicationLog
{
	//_______________________LES VARIABLES____________________________________
	protected String message;
		
	/** TP1 : Tableau au sens des collections **/
	protected ArrayList<IApplicationLogListener> listeners;
	
	
	//_______________________LES METHODES____________________________________
	public AbstractApplicationLog()
	{
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
	//Méthode getMessage
	public String getMessage()
	{
		return message;
	}
	
    /** TP1 : Fonction venant de l'interface par héritage */
	//Méthode addListerner
	public void addListener(IApplicationLogListener listener) 
	{
		this.listeners.add(listener);
	}
	
	//Méthode getApplicationLogListener
	public IApplicationLogListener[] getApplicationLogListeners()
	{
		int i = 0;
		IApplicationLogListener[] tab = new IApplicationLogListener[this.listeners.size()];
		for (IApplicationLogListener listener : this.listeners)
		{
			tab[i] = listener;
			i++;	
		}
		return tab;
	}

	
	/** Listener action */
	//Méthode fireMessage
	protected void fireMessage(String level, String message)
	{
		for (IApplicationLogListener listener_i : listeners)
		{
			//Méthode qui va dépendre du type d'erreur(level) et le message
			listener_i.newMessage(level, message);
		}
	}
	
	//Méthode abstraite setMessage
	public abstract void setMessage(String message);
}
