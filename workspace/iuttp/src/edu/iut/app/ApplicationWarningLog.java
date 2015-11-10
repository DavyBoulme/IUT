package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	//Constructeur de la classe
	public ApplicationWarningLog()
	{
		super();
	}
	
	@Override
	//M�thode setMessage
	public void setMessage(String message) 
	{
		//Appel indirecte � newMessage()
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
	}

}

