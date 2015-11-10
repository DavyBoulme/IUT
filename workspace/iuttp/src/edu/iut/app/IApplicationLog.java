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
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener listener);
	public IApplicationLogListener[] getApplicationLogListeners();
	
}
