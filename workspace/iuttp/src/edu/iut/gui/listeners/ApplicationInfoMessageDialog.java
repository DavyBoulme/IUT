package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

/**
 * <b> ApplicationInfoMessageDialog est la classe repr�sentant les messages d'informations de l'application</b>
 * @author DavyKui
 */
public class ApplicationInfoMessageDialog extends AbstractApplicationMessageDialog 
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
	protected void showMessage(String level, String message) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.INFORMATION_MESSAGE, null);
	}
}
