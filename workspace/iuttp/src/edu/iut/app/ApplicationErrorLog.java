package edu.iut.app;


/**
 * <b>ApplicationErrorLog est la classe représentant les applicationErrorlogs</b>

 * On peut modifier les élèments de la ApplicationErrorLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class ApplicationErrorLog extends AbstractApplicationLog 
{

	/** Ajouter un tableau ou profiter de l'héritage ? */
	// pas d'ajout de t'ableau car celui-ci est present dans la classe mère
	// et est accesible a toute les classes filles
	
	
	//_______________________LES METHODES____________________________________
	public ApplicationErrorLog()
	{
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		//Appel indirecte à newMessage()
		this.message = message;	// ici le message est conserver
		super.fireMessage("[ERROR]", this.message);	// dans la methode fireMessage,
													// le tableau de la classe est deja parcouru
	}
}