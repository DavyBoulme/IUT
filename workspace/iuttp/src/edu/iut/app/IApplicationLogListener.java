package edu.iut.app;

//Interface IApplicationLogListener
public interface IApplicationLogListener
{	
	//Méthode newMessage( level, message)
	//level correspond à un niveau (Warning, Error, )
	void newMessage(String level, String message);
}
