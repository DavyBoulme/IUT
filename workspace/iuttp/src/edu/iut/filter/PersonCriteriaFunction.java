package edu.iut.filter;

import java.util.ArrayList;

import edu.iut.app.Person;

public class PersonCriteriaFunction {

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
