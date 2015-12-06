package edu.iut.app;


/**
 * <b>Classroom</b>
 *Nous n'avions pas toucher à la classe
 * @author DavyKui
 */
public class Classroom {
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	public Classroom(String classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}
	
	public void setClassroomNumber(String number) {
		classRoomNumber = number;
	}
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
