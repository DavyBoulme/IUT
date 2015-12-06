package edu.iut.gui.widget.agenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;


/**
 * <b>AgendaPanelFactory est la classe repr�sentant les mois, jours et semaine de l'application</b>
 * <p>
 * Un AgendaPnaleFactory est caract�ris� par les attributs suivants :
 * <ul>
 * <li>Un MONTH_VIEW qui g�re le mois</li>
 * <li>Un WEEK_VIEW qui g�re la semaine</li>
 * <li>Un DAY_VIEW qui g�re le jour</li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les attributs de AgendaPanelFactory avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class AgendaPanelFactory 
{
	//________________ATTRIBUTS DE LA CLASSE___________________
	 /**
     * L'ActiveView est l'attribut qui g�re le mois, jour et la semaine
     */
	public enum ActiveView{
		MONTH_VIEW("Month View"),
		WEEK_VIEW("Week View"),
		DAY_VIEW("Day View");
		
		private String activeView;
		
		
		
		//________________METHODES DE LA CLASSE___________________
		
		/**
	     * constructeur de la classe
	     * @param activeView
	     * 		on initialise l'activeView par celui qui est pris en param�tre
	     */
		ActiveView(String activeView)
		{
			this.activeView = activeView;
		}
		
		
		/**
	     * fonction qui retourne l'activeView
	     * @return activeView
	     */
		public String toString()
		{
			return activeView;
		}		
	}
	
	/**
     * constructeur de la classe
     * 	
     */
	public AgendaPanelFactory() {
	}
	
	
	/**
     * m�thode qui retourne une JPanel li�e � l'engenda ActiveView
     * @return JPanel
     * @param activeView
     * 		selon l'activeView pris en param�tre, 
     * 		on initialise la panel selon le param�tre
     */
	public JPanel getAgendaView(ActiveView activeView)
	{
		JPanel agendaView = null;
		//Selon le param�tre on initialise la panel
		switch (activeView) {
			case MONTH_VIEW:
				MonthPanel monthPanel = new MonthPanel();
				agendaView = monthPanel;
				break;
			case WEEK_VIEW:
				WeekPanel weekPanel = new WeekPanel();
				agendaView = weekPanel;
				break;
			case DAY_VIEW:
				DayPanel dayPanel = new DayPanel(activeView,WeekDayNames.EMPTYDAY);
				agendaView = dayPanel;
				break;
			default:
				break;				
		}
		//on retourne la JPanel
		return agendaView;
	}

}
