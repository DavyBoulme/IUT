package edu.iut.filter;

import java.util.ArrayList;
import edu.iut.app.*;


/**
 * <b>ClassroomCriteria est la classe repr�sentant les crit�res sur la classroom</b>
 * @author DavyKui
 */
public class ClassroomCriteria {
	
	//________________METHODES DE LA CLASSE___________________
	/**
     * Cr�ation d'une ArrayList � l'aide de la fonction
     * @return ArrayList<Classroom> cr�er dans la fonction
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
