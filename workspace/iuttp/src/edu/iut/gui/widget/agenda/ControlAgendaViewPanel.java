package edu.iut.gui.widget.agenda;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;
	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		this.add(Spinner());
	}
	
	private  JPanel Spinner() {
		JPanel setDate = new JPanel();
		Calendar cal = Calendar.getInstance();
		
		String[] months = { "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };
		JComboBox monthsList = new JComboBox(months);
		monthsList.setSelectedIndex(cal.get(Calendar.MONTH));
		
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		JComboBox daysList = new JComboBox(days);
		daysList.setSelectedIndex(cal.get(Calendar.DAY_OF_WEEK));

		SpinnerModel spinner = new SpinnerNumberModel(cal.get(Calendar.YEAR), 2010, 2020, 1);
		
		setDate.add((Component) spinner);
		setDate.add(monthsList);
		setDate.add(daysList);
		
		
		return setDate;
	}
	
}
