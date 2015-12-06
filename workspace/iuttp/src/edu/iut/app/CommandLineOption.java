package edu.iut.app;


/**
 * <b>CommandLineOption</b>
 * <p>
 * CommandLineParser est caract�ris� par les attributs suivants :
 * <ul>
 * <li>Un enum qui contient File, String; NONE, INTEGER, DOUBLE</li>
 * <li>ArrayList<String> </li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les �l�ments de CommandLineParser avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class CommandLineOption<ValueType> {
	
	//_______________________LES VARIABLES____________________________________
	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue");
		private String optionType;
		
		
		//_______________________LES METHODES____________________________________
		/**
         * m�thode qui initialise l'optionType
         * @param optionType
         * 		on initilise l'optionType avec celui pris en param�tre
         */
		OptionType(String optionType) {
			this.optionType = optionType;
		}
		
		
		/**
         * m�thode retourne l'optionType
         * @return optionType
         */
		public String toString() {
			return optionType;
		}		
	}
	
	
	/**
     * Constructeur de la classe
     */
	public CommandLineOption() {		
		/* EX1: Initializer les attributs */
		key = new String();
		description = new String();
		defaultValue = null;
		value = null;
		optionType = OptionType.NOVALUE;
	}

	
	/**
     * Constructeur de la classe avec des param�tres
     * @param optionType
     * 		on initilise l'optionType avec celui pris en param�tre
     * @param key
     * 		on initilise key avec celui pris en param�tre
     * @param description
     * 		on initilise descritpion avec celui pris en param�tre
     * @param defaultValue
     * 		on initilise defaultvalue avec celui pris en param�tre
     */
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType = optionType;
		this.key = key;
		this.description = description;
		this.defaultValue = defaultValue;
		
	}
	
	//______________________LES GETTEURS ET SETTEURS_____________________________________
	/**
     * M�thode qui initialise les optionType
     * @param optionType
     * 		on initilise l'optionType avec celui pris en param�tre
     * @param key
     * 		on initilise key avec celui pris en param�tre
     * @param description
     * 		on initilise descritpion avec celui pris en param�tre
     * @param defaultValue
     * 		on initilise defaultvalue avec celui pris en param�tre
     */
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType = optionType;
		this.key = key;
		this.description = description;
		this.defaultValue = defaultValue;
	}
	
	
	 /**
     * m�thode qui modifie value
     * @param value
     * 		value da la classe sera modifier
     */
	public  void setValue(ValueType value) {
		this.value = value;
	}
	
	
	 /**
     * m�thode qui retourne la key
     * @return key
     */
	public String getKey() {
		return this.key;
	}
	
	 /**
     * m�thode qui retourne la description
     * @return description
     */
	public String getDescription() {
		return this.description;
	}
	
	
	 /**
     * m�thode qui retourne le valueType
     * @return value
     */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	
	 /**
     * m�thode qui retourne OptionType
     * @return optionType
     */
	public OptionType getOptionType() {
		return optionType;
	}

	//Attributs de la classe
	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;
	

}
