package edu.iut.app;


/**
 * <b>ApplicationWarningLog est la classe repr�sentant les applicationWarninglogs</b>

 * On peut modifier les �l�ments de la ApplicationWarningLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationWarningLog extends AbstractApplicationLog {

	//_______________________LES METHODES____________________________________
	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	
	 /**
     * Constructeur de la classe
     */
	public ApplicationWarningLog()
	{
		super();
	}
	
	
	 /**
     * m�thode setMassage quiu affiche le message avec warning
     * @param message
     * 		le message en param�tre sera utilis� lors de l'affichage
     */
	@Override
	//M�thode setMessage
	public void setMessage(String message) 
	{
		//Appel indirecte � newMessage()
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

}

