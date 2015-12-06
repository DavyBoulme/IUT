package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;


/**
 * <b> AbstractApplicationMessageDialog est la classe représentant les messages de l'application</b>
 * La classe est abstraite est sera utilisée dans d'autres classes
 * @author DavyKui
 */
public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	
	/**
	 * @param level
	 * 		on afficher le type de message avec showMessage
	 * @param message
	 * 		on afficher le message avec showMessage
	 */
	@Override
	public void newMessage(String level, String message)
	{
	 /* TP1 : CODE A FOURNIR */		
		showMessage(level, message);	
	}
	
	/* TP1 ajouter une méthode abstraite showMessage */
	protected abstract void showMessage(String level, String message);
}
