package edu.iut.app;



/**
 * <b> Person est la classe  repr�sentant une personne</b>
 * <p>
 * Person est caract�ris� par les attributs suivants :
 * <ul>
 * <li>PersonFunction qui peut est un �l�ve, jury ou encore un el�ve</li>
 * <li>Une ArrayList<IApplicationLogListener> pour g�rer les IapplicationLogListeners </li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les �l�ments de la AbstractApplicationLog avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class Person {
	
	//_______________________LES VARIABLES____________________________________
	public enum PersonFunction{
		/* EX2 : Internationalisation */
		NONE("None"),
		JURY("Jury"),
		STUDENT("Student");
		
		private String personFunction;
		
		
		//_______________________LES METHODES____________________________________
		  /**
         * m�thode PersonFunction qui initialise la personFunction avec le param�tre
         * @param personFunction
         * 			On initialise l'attribut de notre classe avec le param�tre
         */
		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}
		
		
		  /**
         * m�thode retourne personFunction
         * @return personFunction
         */
		public String toString() {
			return personFunction;
		}		
	}
	
	
	  /**
     * Constructeur de la classe initialise la personFunction a NONE
     */
	public Person() {
		personFunction = PersonFunction.NONE;
	}
	
	
	  /**
     * Constructeur de la classe initialise avec les param�tres 
     * @param personFunction
     * @param firstname
     * @param lastname
     * @param email
     * @param phone
     */
	public Person(PersonFunction personFunction,
				  String firstname,
				  String lastname,
				  String email,
				  String phone) {
		this.personFunction = personFunction;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		/* EX2: initialisation */;
	}
	
	
	//_______________LES GETTEURS ET SETTEURS DE LA CLASSE_____________________________________
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}
	public PersonFunction getFunction() {
		return personFunction;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}

	
	protected PersonFunction personFunction;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phone;
	

	}
