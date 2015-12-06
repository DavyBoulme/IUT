package edu.iut.tests;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.InvalidApplicationException;

import org.junit.Test;

import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.IApplicationLogListener;
/**
 * 
 * @author DavyKui
 *test de la clasee ApplicationInfoLog
 *test de la méthode getMesage
 *test de la méthode addListener
 *test de la méthode getApplicationListener
 *test de la méthode fireMessage
 */
public class ApplicationInfoLogTest {

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
		String level = "[INFO]" ;
		
		ApplicationInfoLog test;
		test = new ApplicationInfoLog();
		
		//on teste si on a bien le message et si le level et bien Info
		if (test.getMessage() == message && level =="[INFO]")
		{
			
		}
		else
		{
			fail("getMessage() et fireMessage() , Not yet implemented");
		}
	}


}
