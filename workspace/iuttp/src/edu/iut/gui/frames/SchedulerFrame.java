package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;
import edu.iut.gui.widget.agenda.DayPanel;
import edu.iut.gui.widget.agenda.MonthPanel;
import edu.iut.gui.widget.agenda.WeekPanel;



/**
 * <b>SchedulerFrame est la classe représentant les panels de l'application</b>
 * <p>
 * Un SchedulerFrame est caractérisé par les attributs suivants :
 * <ul>
 * <li>Une JPanel qui gère l'affichage à droite et d'autres JPanels</li>
 * <li>Un CardLayout</li>
 * <li>agendaPanelFactory</li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les élèments de la SchedulerFrame avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class SchedulerFrame extends JFrame implements ActionListener
{
	//________________ATTRIBUTS DE LA CLASSE___________________
	
	 /**
     * Le contentPane qui est modifiable dans certaines fonctions
     */
	JPanel contentPane;
	
	/**
     * Le layerLayout qui est modifiable dans certaines fonctions
     */
	CardLayout layerLayout;
	
	/**
     * Le agendaPanelFactory qui est utilisé dans certaines méthodes
     */
	AgendaPanelFactory agendaPanelFactory;	
	
	/**
     * Les panels qui vont être utilisés
     */
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;
	
	
	 
	//________________METHODES DE LA CLASSE___________________
	/**
     * Création d'un JMenuBar à l'aide d'une fonction 
     * @return la JmMenuBar créer dans la fonction
     */
		private JMenuBar ajouterMenu()
		{
			//Le menu de départ
			JMenuBar menu = new JMenuBar();
			
			
			 //Les Onglets du Menu
		    JMenu fichier =new JMenu("File");
		    JMenu edit =new JMenu("Edit");
		    JMenu help =new JMenu("Help");
		
		    
		  //Sous Onglets de l'onglet File
		    JMenuItem load = new JMenuItem("Load");
		    JMenuItem sauvegarder = new JMenuItem("Save");
		    JMenuItem quitter = new JMenuItem("quit");
		    
		  //Sous Onglets de l'onglet Edit
		    JMenu view = new JMenu("View");
		   
		  //Sous Onglets de l'onglet View
		    JMenuItem month = new JMenuItem("Month");
		    month.setActionCommand("month");
			month.addActionListener(this);
			
		//Gestion de week  
		    JMenuItem week = new JMenuItem("Week");
		    week.setActionCommand("week");
		    week.addActionListener(this);
		    
		  //Gestion de day
		    JMenuItem day = new JMenuItem("Day");
		    day.setActionCommand("day");
		    day.addActionListener(this);
		    
		    //Sous Onglets de l'onglet Help
		    JMenuItem display = new JMenuItem("Display");
		    JMenuItem about = new JMenuItem("About");
		
		    	    
		    //Ajout dans le menu
		    menu.add(fichier);
		    menu.add(edit);
		    menu.add(help);
		    
		    //Ajout dans le sous onglet file
		    fichier.add(load);
		    fichier.add(sauvegarder);
		    fichier.add(quitter);
		    
		    //Ajout dans l'onglet edit
		    edit.add(view);
		    
		    //Ajout dans l'onglet view
		    view.add(month);
		    view.add(week);
		    view.add(day);
		    
		    //Ajout dans l'onglet Help
		    help.add(display);
		    help.add(about);
		       
		    //Rendre le menu visible
		    menu.setVisible(true);
			return menu;			
		}
	
	
		  /**
         * mettre à jour les panels (contentpane, layerLayout,etc...)
         */
	protected void setupUI() {
		
		//On initilisalise tous les panels
		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);
		
		//On ajoute les dates, jour et mois dans le contentpane
		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());
	
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);
	
		//Ajout du menu 
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;		
		JMenuItem menuItem;
		
		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		
		menu = new JMenu("File");
		
		//Nous avions créé une méthode pour gérer le menu
		this.setJMenuBar(ajouterMenu());
		this.pack();
		layerLayout.next(contentPane);
	}
	
	
	   /**
     * Constructeur SchedulerFrame.
     * <p>
     * A la construction d'un objet SchedulerFrame, on ajoute le menu
     * </p>
     */
	public SchedulerFrame() 
	{
		super();
		this.add(ajouterMenu());
		
		//ajout d'un actionlistener pour quitter l'application
		addWindowListener (new WindowAdapter()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		//on initiliase les panel à nul
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	
	
	   /**
     * Constructeur SchedulerFrame.
     * <p>
     * A la construction d'un objet SchedulerFrame, on ajoute le menu
     * </p>
     * @param title
         *            Le nouveau titre du SchedulerFrame.
         */
	public SchedulerFrame(String title) 
	{	
		super(title);
		this.add(ajouterMenu());
		//ajout d'un actionlistener pour quitter l'application
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		//On met à jour tous les panels
		setupUI();
	}


	   /**
     * Gérer les actions du menu (actionEvent)
         */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Listerner du menuItem pour les 3 sous menu du l'index "edit"
		switch(e.getActionCommand()) 
		{
		case "month" :
			// on affiche un panel enregistrer dans le contentPane vie le cardLayout. ici le panel month
			layerLayout.show(contentPane, ActiveView.MONTH_VIEW.name());
			break;
		case "day" :
			// panel day
			layerLayout.show(contentPane, ActiveView.DAY_VIEW.name());
			break;
		case "week" :
			// panel week
			layerLayout.show(contentPane, ActiveView.WEEK_VIEW.name());
			break;
		}
		
	}




}
