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
 * @author St�phane
 *test de la clasee ApplicationInfoLog
 *test de la m�thode getMesage
 *test de la m�thode addListener
 *test de la m�thode getApplicationListener
 *test de la m�thode fireMessage
 */
public class ApplicationLogsTest {

	//Test getError()
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
	
	//Test getWarning()
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
	
	
	//Test getInfos()
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
