package edu.iut.app;

import java.util.ArrayList;


/**
 * <b>ApplicationLogs est la classe représentant les applicationlogs</b>

 * On peut modifier les élèments de la ApplicationLogs avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationLogs extends ArrayList<IApplicationLog>
{

	public ApplicationLogs()
	{		
		super();
	}
	
	
	//___________________________EXERCICE 2_______________________________________
	
	//Méthode getError() qui retourune une ArrayList de IApplicationLog
	public ArrayList<IApplicationLog> getErrors() 
	{
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for(IApplicationLog i : this)
		{
			if(i instanceof ApplicationErrorLog)
				filteredLogs.add(i);
		}
		return filteredLogs;
	}
	
	//Méthode getWarnings() qui retourune une ArrayList de IApplicationLog
	public ArrayList<IApplicationLog> getWarnings()
	{
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for(IApplicationLog i : this)
		{
			if(i instanceof ApplicationWarningLog)
				filteredLogs.add(i);
		}

		return filteredLogs;
	}
	
	
	//Méthode getInfos() qui retourune une ArrayList de IApplicationLog
	public ArrayList<IApplicationLog> getInfos()
	{
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		
		for(IApplicationLog i : this)
		{
			if(i instanceof ApplicationInfoLog )
				filteredLogs.add(i);		
		}
		return filteredLogs;
	}
	

}

