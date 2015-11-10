package edu.iut.app;


public class ApplicationErrorLog extends AbstractApplicationLog 
{

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	// pas d'ajout de t'ableau car celui-ci est present dans la classe m�re
	// et est accesible a toute les classes filles
	
	
	//_______________________LES METHODES____________________________________
	public ApplicationErrorLog()
	{
		super();
	}
	
	@Override
	public void setMessage(String message)
	{
		//Appel indirecte � newMessage()
		this.message = message;	// ici le message est conserver
		super.fireMessage("[ERROR]", this.message);	// dans la methode fireMessage,
													// le tableau de la classe est deja parcouru
	}
}