package edu.iut.app;

//Interface IApplicationLog
public interface IApplicationLog 
{
	/** TP1 : Cr��rr les m�thodes :
	 - setMessage
	 - getMessage
	 - addListener
     - getApplicationLogListeners();
	*/
	
	//_________________Les m�thodes_____________________________
	
	void setMessage(String message);
	
	void addListener(IApplicationLogListener listener); // methode d'ajout
	
	String getMessage();
	
	IApplicationLogListener[] getpplicationLogListeners(); // obtention du tableau
	
}
