package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends AbstractApplicationMessageDialog 
{

	@Override
	//M�thode ShowMessage red�finie
	protected void showMessage(String level, String message)
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, message, level, JOptionPane.ERROR_MESSAGE, null);
	}

}
