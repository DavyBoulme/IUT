package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationInfoMessageDialog extends AbstractApplicationMessageDialog 
{

	protected void showMessage(String level, String message)
	{
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		JOptionPane.showMessageDialog(null, "[Info]" + message);
	}

	@Override
	protected void showMessage() {
		// TODO Auto-generated method stub
		
	}
}
