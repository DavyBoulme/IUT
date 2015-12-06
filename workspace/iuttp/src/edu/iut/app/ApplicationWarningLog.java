package edu.iut.app;


/**
 * <b>ApplicationWarningLog est la classe représentant les applicationWarninglogs</b>

 * On peut modifier les élèments de la ApplicationWarningLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationWarningLog extends AbstractApplicationLog {

	//_______________________LES METHODES____________________________________
	/** Ajouter un tableau ou profiter de l'héritage ? */
	
	 /**
     * Constructeur de la classe
     */
	public ApplicationWarningLog()
	{
		super();
	}
	
	
	 /**
     * méthode setMassage quiu affiche le message avec warning
     * @param message
     * 		le message en paramètre sera utilisé lors de l'affichage
     */
	@Override
	//Méthode setMessage
	public void setMessage(String message) 
	{
		//Appel indirecte à newMessage()
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

}

