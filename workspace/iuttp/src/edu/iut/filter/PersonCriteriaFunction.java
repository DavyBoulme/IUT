package edu.iut.filter;

import java.util.ArrayList;

import edu.iut.app.Person;


/**
 * <b> PersonCriteriaFunction est la classe représentant les critères sur une personne</b>
 * @author DavyKui
 */
public class PersonCriteriaFunction {

	//________________METHODES DE LA CLASSE___________________	
	/**
    * Création d'une ArrayList à l'aide de la fonction
    * @return ArrayList<Person> créer dans la fonction		
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
