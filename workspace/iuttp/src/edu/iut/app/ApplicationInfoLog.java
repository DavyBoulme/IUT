package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog
{

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		this.message = message;
		//Appel indirecte � newMessage()
        super.fireMessage("[INFO]", this.message);
	}

}
