package edu.iut.filter;

import java.util.ArrayList;
import edu.iut.app.*;

public class ClassroomCriteria {

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
