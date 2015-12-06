package edu.iut.app;


/**
 * <b>Document</b>
 *Nous n'avions pas toucher à la classe
 * @author DavyKui
 */
public class Document {
	
	public Document() {
		documentURI="";
	}
	public Document(String documentURI) {
		this.documentURI = documentURI;
	}
	
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	public String getDocumentURI() {
		return documentURI;
	}
	
	protected String documentURI;
}
