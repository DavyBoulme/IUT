    package edu.iut.gui.widget.agenda;

    import java.awt.GridLayout;
    import java.util.ArrayList;
    import java.util.Calendar;
    import java.util.GregorianCalendar;

    import javax.swing.JPanel;

    import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
    import edu.iut.gui.widget.agenda.WeekPanel.WeekDayNames;

    /**
     * <b>MothPanel est la classe qui g�re les mois de l'application</b>
     * @author DavyKui
     */
    public class MonthPanel extends EventPanel {

    	
    	 /**
         * constructeur de la classe qui cr�er une gridLayout et initialise les valeurs � l'int�rieur
         */
        public MonthPanel() {
            super(ActiveView.MONTH_VIEW);
            GridLayout daysOfMonthLayout = new GridLayout(7,5);		
            this.setLayout(daysOfMonthLayout);
            GregorianCalendar calendar = new GregorianCalendar();		
            for (int di = 0;di<calendar.getActualMaximum(Calendar.DAY_OF_MONTH);di++) {
                JPanel day = new DayPanel(ActiveView.MONTH_VIEW,WeekDayNames.EMPTYDAY);
                this.add(day);
            }
        }
    }
