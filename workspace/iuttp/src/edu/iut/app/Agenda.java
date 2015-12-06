package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * <b>Agenda</b>
 *Nous n'avions pas toucher à la classe
 * @author DavyKui
 */
public class Agenda extends ArrayList<ExamEvent> {
	public Agenda() {		
	}
	
	public void addCheckedEvent(ExamEvent examEvent) {
		this.add(examEvent);
	}
	
}
