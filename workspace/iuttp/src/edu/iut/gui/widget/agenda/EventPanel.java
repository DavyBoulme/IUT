 package edu.iut.gui.widget.agenda;
import javax.swing.JPanel;


/**
 * <b>EventPanel est la classe qui gère les evènements de l'application</b>
 * @author DavyKui
 */
public class EventPanel extends JPanel {
	
	
	//________________ATTRIBUTS DE LA CLASSE___________________
	 /**
     * L'ActiveView est l'attribut qui gère le mois, jour et la semaine
     */
	protected AgendaPanelFactory.ActiveView activeView;
	
	
	 /**
     * constructeur de la classe qui initialise l'activeview de la classe
     * @param activeview
     * 			on initialise notre activeview par celui qui est pris en paramètre
     */
	public EventPanel(AgendaPanelFactory.ActiveView activeView)
	{
		this.activeView = activeView;
	}

}
