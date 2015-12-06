package edu.iut.app;


/**
 * <b>ApplicationInfoLog est la classe représentant les applicationInfologs</b>

 * On peut modifier les élèments de la ApplicationInfoLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationInfoLog extends AbstractApplicationLog
{

	/** Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		this.message = message;
		//Appel indirecte à newMessage()
        super.fireMessage("[INFO]", this.message);
	}

}
