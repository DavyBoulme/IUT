package edu.iut.gui.listeners;

import javax.swing.JOptionPane;


/**
 * <b> ApplicationErrorMessageDialog est la classe représentant les messages d'erreurs de l'application</b>
 * @author DavyKui
 */
public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog 
{
	/**
	 * méthode qui redefinie show message de sa classe abstraite
	 * @param level
	 * 		on afficher le type de message avec showMessage
	 * @param message
	 * 		on afficher le message avec showMessage
	 */
	
	@Override
	//Méthode ShowMessage redéfinie
	protected void showMessage(String level, String message)
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.ERROR_MESSAGE, null);
	}

}
