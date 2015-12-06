package edu.iut.gui.widget.agenda;
import java.awt.MenuItem;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.MenuComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import edu.iut.app.*;


/**
 * <b>ControlAgendaView est la classe qui représente la partie de gauche de l'application</b>
 * <p>
 * Un ControlAgendaView est caractérisé par les attributs suivants :
 * <ul>
 * <li>Un CardLayout </li>
 * <li>Un contentPane</li>
 * <li>Une applicationSession</li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les attributs de ControlAgendaView avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ControlAgendaViewPanel extends JPanel  {

	//________________ATTRIBUTS DE LA CLASSE___________________
	/**
     * Le cardLayout est l'attribut qui gère l'agenda
     */
	CardLayout agendaViewLayout;
	
	/**
     * Le contentPane est l'attribut qui gère la panel (l'affichage)
     */
	JPanel contentPane;
	
	/**
     * L'ApplicationSession est l'attribut qui gère les sessions
     */
	ApplicationSession app;
	
	
	/**
     * Les entiers qui gèrent le mois, jours ou semaine selectionné
     */
	int selectedYear;
	int selectedMonth;
	int selectedDay;
	
	Integer[] days = new Integer[30];
	
	
	/**
     * constructeur de la classe
     * @param layerLayout
     * 		on initialise le layerLayout par celui qui est pris en paramètre
     * * @param contentpane
     * 		on initialise le contentpane par celui qui est pris en paramètre
     * 
     * on ajoute le spinner à l'aide de sa fonction au lieu du bouton next
     */
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane)
	{
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		this.add(Spinner());
	}
	
	
	
	/**
     * méthode qui retourne la Panel qui contient notre Spinner et comoboBox
     * @return JPanel
     */
	private  JPanel Spinner() 
	{// fonction qui initialise les composant du panel de gauche, c'est a dire le spinner et les combobox
		
		
		JPanel setDate = new JPanel();
		//on recupere un calendrier
		GregorianCalendar gre = (GregorianCalendar) GregorianCalendar.getInstance();

		//table de mois recuerer des ressources bundle
		String[] months = app.instance().getMonths();
		// on creer la combobox avec ce tableau
		JComboBox monthsList = new JComboBox(months);
		//on selectionne l'index de la combobox par rapport a la dte du jour
		monthsList.setSelectedIndex(gre.get(Calendar.MONTH));
		
		
		// pareil pour les jour avec une combobox qui va de 1 a 31
		for(int i = 0; i<days.length; i++)
			days[i] = i+1;
		JComboBox daysList = new JComboBox(days);
		daysList.setSelectedIndex(gre.get(Calendar.DAY_OF_WEEK));

		// pareil pour la spinner avec les annees
		SpinnerModel spinner = new SpinnerNumberModel(gre.get(Calendar.YEAR), 2010, 2020, 1);
		JSpinner spin = new JSpinner(spinner);
		
		selectedDay = daysList.getSelectedIndex() + 1; // jour selectionné dans la liste de 1 a x. +1 pour le jour exact.
		
		//on ajoute les elements
		setDate.add(spin);
		setDate.add(monthsList);
		setDate.add(daysList);
		
		
		
		return setDate;
	}
	
	
		
	//__________________LES GETTEURS_____________________
	/**
     * méthode qui retourne l'année selectionnée
     * @return int
     */
	public int getYear() {
		return selectedYear;
	}
	
	/**
     * méthode qui retourne le mois selectionné
     * @return int
     */
	public int getMonth() {
		return selectedMonth;
	}
	
	/**
     * méthode qui retourne le jour selectionnée
     * @return int
     */
	public int getDay() {
		return selectedDay;
	}		
	
	
	
}
