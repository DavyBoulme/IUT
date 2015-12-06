package edu.iut.filter;

import java.util.ArrayList;
import edu.iut.app.*;


/**
 * <b>ClassroomCriteria est la classe représentant les critères sur la classroom</b>
 * @author DavyKui
 */
public class ClassroomCriteria {
	
	//________________METHODES DE LA CLASSE___________________
	/**
     * Création d'une ArrayList à l'aide de la fonction
     * @return ArrayList<Classroom> créer dans la fonction
     */
	public ArrayList<Classroom> meetCriteria(ArrayList<Classroom> classroom, String room) {

	      ArrayList<Classroom> classFiltred = new ArrayList<Classroom>(); 
	      
	      for (Classroom c : classroom) {
	         if(c.getClassRoomNumber().equals(room)){
	            classFiltred.add(c);
	         }
	      }
	      return classFiltred;
	}

	
	
}
