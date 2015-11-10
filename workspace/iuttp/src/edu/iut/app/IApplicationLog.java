package edu.iut.app;

//Interface IApplicationLog
public interface IApplicationLog 
{
	/** TP1 : Créérr les méthodes :
	 - setMessage
	 - getMessage
	 - addListener
     - getApplicationLogListeners();
	*/
	
	//_________________Les méthodes_____________________________
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener listener);
	public IApplicationLogListener[] getApplicationLogListeners();
	
}
