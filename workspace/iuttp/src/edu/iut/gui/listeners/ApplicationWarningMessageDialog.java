package edu.iut.gui.listeners;

import javax.swing.JOptionPane;


/**
 * <b> ApplicationWarningMessageDialog  est la classe repr�sentant les messages warnings de l'application</b>
 * @author DavyKui
 */
public class ApplicationWarningMessageDialog extends AbstractApplicationMessageDialog 
{
	
	/**
	 * m�thode qui redefinie show message de sa classe abstraite
	 * @param level
	 * 		on afficher le type de message avec showMessage
	 * @param message
	 * 		on afficher le message avec showMessage
	 */
	@Override
	//M�thode ShowMessage red�finie
	protected void showMessage(String level, String message) 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.WARNING_MESSAGE, null);
	}

}
