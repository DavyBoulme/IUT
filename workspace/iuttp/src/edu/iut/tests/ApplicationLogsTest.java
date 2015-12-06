package edu.iut.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.iut.app.ApplicationErrorLog;
import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.ApplicationLogs;
import edu.iut.app.ApplicationWarningLog;
import edu.iut.app.IApplicationLog;
/**
 * 
 * @author DavyKui
 *test de la clasee ApplicationInfoLog
 *test de la méthode getMesage
 *test de la méthode addListener
 *test de la méthode getApplicationListener
 *test de la méthode fireMessage
 */
public class ApplicationLogsTest {

	/**
     * test de la fonction getError, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testgetErrors() 
	{
		ApplicationLogs test;
		test = new ApplicationLogs();
		
		for(IApplicationLog i : test)
		{
			if(i instanceof ApplicationErrorLog)
			{
				//On ne fait rien
			}
			
			else
			{
				fail("getErrors(), not yet implemented");
			}
		}
		
		
	}
	
	/**
     * test de la fonction getWarning, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testgetWarning() 
	{
		ApplicationLogs test;
		test = new ApplicationLogs();
		
		for(IApplicationLog i : test)
		{
			if(i instanceof ApplicationWarningLog)
			{
				//On ne fait rien
			}
			
			else
			{
				fail("getWarning(), not yet implemented");
			}
		}
		
		
	}
	
	
	/**
     * test de la fonction getInfos, s'il  y a une erreur, on retourne un message
     */
	@Test
	public void testgetInfos() 
	{
		ApplicationLogs test;
		test = new ApplicationLogs();
		
		for(IApplicationLog i : test)
		{
			if(i instanceof ApplicationInfoLog)
			{
				//On ne fait rien
			}
			
			else
			{
				fail("getInfo(), not yet implemented");
			}
		}
		
		
	}

}
