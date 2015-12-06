package edu.iut.app;


/**
 * <b>ApplicationInfoLog est la classe repr�sentant les applicationInfologs</b>

 * On peut modifier les �l�ments de la ApplicationInfoLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
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
