package edu.iut.app;

//Interface IApplicationLogListener
public interface IApplicationLogListener
{	
	//M�thode newMessage( level, message)
	//level correspond � un niveau (Warning, Error, )
	void newMessage(String level, String message);
}
