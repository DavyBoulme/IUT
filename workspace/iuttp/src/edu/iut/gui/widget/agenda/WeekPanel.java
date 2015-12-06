package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import javax.swing.JPanel;


import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.app.ApplicationSession;



/**
 * <b>WeekPanel est la classe représentant les semaines de l'application</b>
 * @author DavyKui
 */
public class WeekPanel extends EventPanel {

	
	//________________ATTRIBUTS DE LA CLASSE___________________
	 /**
     * L'enum gère les jours de la semaines et les initialise selon l'applicationSession
     */
	public enum WeekDayNames {
		EMPTYDAY("",""),
		MONDAY(ApplicationSession.instance().getString("monday"),ApplicationSession.instance().getString("mon")),
		TUESDAY(ApplicationSession.instance().getString("tuesday"),ApplicationSession.instance().getString("tue")),
		WEDNESDAY(ApplicationSession.instance().getString("wednesday"),ApplicationSession.instance().getString("wed")),
		THURSDAY(ApplicationSession.instance().getString("thursday"),ApplicationSession.instance().getString("thu")),
		FRIDAY(ApplicationSession.instance().getString("friday"),ApplicationSession.instance().getString("fri")),
		SATURDAY(ApplicationSession.instance().getString("saturday"),ApplicationSession.instance().getString("sat")),
		SUNDAY(ApplicationSession.instance().getString("sunday"),ApplicationSession.instance().getString("sun"));
		
		 /**
	     * Les string qui represente name et le shortname 
	     */
		private String name;
		private String shortName;
		
		
		//________________METHODES DE LA CLASSE___________________
		 /**
         * constructeur de la classe qui initialise les valeurs de ces attributs
         * @param name
         * 		on initialise l'atribut de la classe par celui qui est pris en paramètre
         * @param shortName
         * 		on initialise l'atribut de la classe par celui qui est pris en paramètre
         */
		WeekDayNames(String name,String shortName) {
			this.name = name;
			this.shortName = shortName;
		}
		
		
		/**
         * méthode qui retourne le shortname de la classe
         * @return String
         */
		public String getShortName()
		{
			return shortName;
		}
		
		
		
		/**
         * méthode qui retourne le name de la classe
         * @return String
         */
		public String toString() 
		{
			return name;
		}
	}
	
	/**
     * constructeur de la classe qui crée une gridLayout et l'initialise
     */
	public WeekPanel() {
		super(ActiveView.WEEK_VIEW);
		GridLayout daysOfWeekLayout = new GridLayout(1,7);		
		this.setLayout(daysOfWeekLayout);
		for (int di = 0;di<7;di++)	{
			this.add(new DayPanel(ActiveView.WEEK_VIEW,WeekDayNames.values()[di+1]));
		}
	}
}
