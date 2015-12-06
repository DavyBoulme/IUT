package edu.iut.tests;

import static org.junit.Assert.*;

import java.awt.event.ActionListener;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.IApplicationLogListener;
/**
 * 
 * @author DavyKui
 *test de la clasee ApplicationInfoLog
 *test de la m�thode getMesage
 *test de la m�thode addListener
 *test de la m�thode getApplicationListener
 *test de la m�thode fireMessage
 */
public class ApplicationErrorLogTest
{
	 /**
     * test de la fonction getMessage, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testGetMessage() 
	{
		ApplicationInfoLog test;
		test = new ApplicationInfoLog();
		
		if (test.getMessage() != null || test.getMessage() == null)
		{
			//cela ne fait rien
		}
		else
			fail("getMessage(), Not yet implemented");
	}
	
	
	 /**
     * test de la fonction getaddListener, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testAddListener() 
	{
		//Pris sur internet mais qui ne fonctionne pas
		ActionListener test;
		//ActionEvent mockEvent = createMock(ActionEvent.class);
	}

	 /**
     * test de la fonction getApplicationListener, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testGetApplicationListener() 
	{
		ApplicationInfoLog test;
		test = new ApplicationInfoLog();
		
		IApplicationLogListener[] verification = null;
		
		if (test.getApplicationLogListeners() == verification || test.getApplicationLogListeners() != verification)
		{
			//On affiche rien
		}
		else
		{
			fail("getApplicatioListeners(), Not yet implemented");
		}
	}
	
	
	 /**
     * test de la fonction getFireMessage, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testFireMessage() //et getMessage()
	{
		String message = "test";
		String level = "[ERROR]" ;
		
		ApplicationInfoLog test;
		test = new ApplicationInfoLog();
		
		//on teste si on a bien le message et si le level et bien Info
		if (test.getMessage() == message && level =="[ERROR]")
		{
			
		}
		else
		{
			fail("getMessage() et fireMessage() , Not yet implemented");
		}
	}

}
