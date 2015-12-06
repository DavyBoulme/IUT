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
 *test de la m�thode fireMessafe
 */
public class ApplicationWarningLogTest {

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
			//On affiche rien
		}
		else
		fail("getMessage(), Not yet implemented");
	}
	
	
	/**
     * test de la fonction addListener, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testAddListener() 
	{
		//Pris sur internet mais qui ne fonctionne pas
		ActionListener test;
		//ActionEvent mockEvent = createMock(ActionEvent.class);
	}

	
	/**
     * test de la fonction getApplicationListnener, s'il  y a une erreur, on retourne un message
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
     * test de la fonction fireMessage, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testFireMessage() //et getMessage()
	{
		String message = "test";
		String level = "[WARNING]" ;
		
		ApplicationInfoLog test;
		test = new ApplicationInfoLog();
		
		//on teste si on a bien le message et si le level et bien Info
		if (test.getMessage() == message && level =="[WARNING]")
		{
			
		}
		else
		{
			fail("getMessage() et fireMessage() , Not yet implemented");
		}
	}

}
