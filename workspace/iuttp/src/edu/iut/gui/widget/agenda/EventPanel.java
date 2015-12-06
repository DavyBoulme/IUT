 package edu.iut.gui.widget.agenda;
import javax.swing.JPanel;


/**
 * <b>EventPanel est la classe qui g�re les ev�nements de l'application</b>
 * @author DavyKui
 */
public class EventPanel extends JPanel {
	
	
	//________________ATTRIBUTS DE LA CLASSE___________________
	 /**
     * L'ActiveView est l'attribut qui g�re le mois, jour et la semaine
     */
	protected AgendaPanelFactory.ActiveView activeView;
	
	
	 /**
     * constructeur de la classe qui initialise l'activeview de la classe
     * @param activeview
     * 			on initialise notre activeview par celui qui est pris en param�tre
     */
	public EventPanel(AgendaPanelFactory.ActiveView activeView)
	{
		this.activeView = activeView;
	}

}
