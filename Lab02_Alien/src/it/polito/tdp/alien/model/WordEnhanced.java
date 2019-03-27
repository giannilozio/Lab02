package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {

	private String alienWord;
	private String translation;
	private List<String> translations;
	
	
	public WordEnhanced(String alienWord, String translation) {
		super();
		this.alienWord = alienWord;
		this.translation = translation;
		translations= new LinkedList<>();
	}
	
	
	public void addTraduzione(String translation) {
		/*int vavva=0;
		for(String g : translations) {
			if(g.equals(translation))
				vavva=1;
		}
		if(vavva==0)
		*/translations.add(translation);
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}
	
	
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
	
	public boolean equals(String  alienWord) {		
		return super.equals(alienWord);
	}


	public String getTranslations() {
		String result="";
		for(String g : translations) {
			result+= g+" ";
		}
		return result;
	}


	public String getTranslation() {
		return translation;
	}
	
	
	





	
}
