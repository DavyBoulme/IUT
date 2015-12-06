package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;


/**
 * <b>CommandLineParser</b>
 * <p>
 * CommandLineParser est caractérisé par les attributs suivants :
 * <ul>
 * <li>HashMap<String, CommandLineOption<?>></li>
 * <li>ArrayList<String> </li>
 * </ul>
 * </p>
 * <p>
 * On peut modifier les élèments de CommandLineParser avec certaine fonctions
 * </p>
 * @author DavyKui
 */
public class CommandLineParser {
	
	//_______________________LES VARIABLES____________________________________
	protected HashMap<String, CommandLineOption<?>> options; //? represente n'importe quel type
	protected ArrayList<String> parseErrors;
	
	
	//_______________________LES METHODES____________________________________
	
	 /**
     * Constructeur de la classe
     */
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<?> >();
		parseErrors = new ArrayList<String>();
	}
	
	
	 /**
     * méthode qui rajoute des commandLineOption
     * @param option
     * 		on ajoute ce paramètre dans notre classe si elle n'est pas nulle
     */
	public void addOption(CommandLineOption<?> option) {
		if (option != null) {
			options.put(option.getKey(),option);
		}
	}
	
	
	 /**
     * méthode qui initialise nos CommandLineOption
     * @param args
     * 		on ajoute ce paramètre dans notre classe si elle n'est pas nulle
     */
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case STRING:
						CommandLineOption<String> stringOption = (CommandLineOption<String>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							stringOption.setValue(new String(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case INTEGER:
						CommandLineOption<Integer> integerOption = (CommandLineOption<Integer>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							integerOption.setValue(new Integer(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}						
						break;
					case DOUBLE:
						CommandLineOption<Double> doubleOption = (CommandLineOption<Double>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							doubleOption.setValue(new Double(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case NOVALUE:
						CommandLineOption<Boolean> boolOption = (CommandLineOption<Boolean>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							boolOption.setValue(new Boolean(keyValue[1]));
						}
						else {
							boolOption.setValue(new Boolean(true));
						}
						break;
					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	
	
	 /**
     * méthode qui retourne les commandLineOption
     * @return CommandLineOption<?>
     */
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	
	
	/**
     * méthode qui retourne les erreurs
     * @return parseErrors
     */
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
