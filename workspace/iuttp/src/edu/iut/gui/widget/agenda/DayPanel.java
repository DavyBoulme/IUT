package edu.iut.gui.widget.agenda;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;



/**
 * <b>DayPanel est la classe qui g�re le jour de l'application</b>
 * @author DavyKui
 */
public class DayPanel extends EventPanel 
{

	/**
     * constructeur de la classe
     * @param activeView
     * 		on initialise le l'activeView par celui qui est pris en param�tre
     * * @param weekDayNames
     * 		on initialise le weekDayNames par celui qui est pris en param�tre
     * 
     * on ajoute le spinner � l'aide de sa fonction au lieu du bouton next
     */
	public DayPanel(ActiveView activeView,WeekDayNames weekDayNames)
	{
		super(activeView);
		switch (activeView) {
		case DAY_VIEW:
		case WEEK_VIEW:
			GridLayout daysLayout;
			
			//Cr�ation de l'affichage pour la semaine
			switch(weekDayNames)
			{
			case EMPTYDAY:
				daysLayout = new GridLayout(24,1);
				this.setLayout(daysLayout);
				break;
			default:
				daysLayout = new GridLayout(25,1);
				this.setLayout(daysLayout);
				this.add(new JLabel(weekDayNames.toString()));
			}
						
			for (int hi = 0;hi<24;hi++) {
				JPanel hour = new JPanel();
				hour.add(new JLabel(new Integer(hi).toString()));
				this.add(hour);
			}
			break;
			
			//cr�ation de l'affichage pour le mois
		case MONTH_VIEW:
			JPanel hour = new JPanel();
			hour.add(new JLabel("H"));
			this.add(hour);
		
		}
	}
	
	protected void setupUIDayView() {
		
	}
	protected void setupUIWeekView() {
		
	}
	protected void setupUIMonthView() {
		
	}


}
