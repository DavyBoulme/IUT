package edu.iut.filter;

import java.util.ArrayList;

import edu.iut.app.Person;


/**
 * <b> PersonCriteriaFunction est la classe repr�sentant les crit�res sur une personne</b>
 * @author DavyKui
 */
public class PersonCriteriaFunction {

	//________________METHODES DE LA CLASSE___________________	
	/**
    * Cr�ation d'une ArrayList � l'aide de la fonction
    * @return ArrayList<Person> cr�er dans la fonction		
    */	
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons, String funtion) {
		
	      ArrayList<Person> functionsP = new ArrayList<Person>(); 
	      
	      for (Person person : persons) {
	         if(person.getFunction().equals(funtion)){
	            functionsP.add(person);
	         }
	      }
	      return functionsP;
	}

	
	
	
	
}
