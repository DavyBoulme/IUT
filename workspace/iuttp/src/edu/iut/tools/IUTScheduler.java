package edu.iut.tools;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * 
 * @author Stéphane
 *Main de l'application ou il sera créer le .jar
 */

public class IUTScheduler {
	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);//Nous pensions qu'en initialisant le locale à France on l'aurait en français mais non
		Locale currentLocale = Locale.getDefault();
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});
	}
	
}
