package edu.iut.tools;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * 
 * @author DavyKui
 *Main de l'application ou il sera créer le .jar
 *On appelle le SchedulerFrame pour créer la panel 
 */

public class IUTScheduler 
{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() 
		    {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});
	}
	
}
