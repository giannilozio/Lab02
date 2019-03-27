package it.polito.tdp.alien.model;

import java.util.*;

public class Dictionary {
	
	List<WordEnhanced> d;
	
	
	public Dictionary() {
		d = new LinkedList<WordEnhanced>();
		
		}


	public void addWord(String alienWord , String translation ) {
		int cacca=0;
		for(WordEnhanced p : d) {
			if(p.getAlienWord().equals(alienWord)) {
				d.remove(p);
				p.addTraduzione(translation);
				d.add(p);
				cacca=1;
			}
		}
		if(cacca==0) {
			WordEnhanced ptemp= new WordEnhanced (alienWord, translation);
			d.add(ptemp);
			
		}
	}
	
	public List<String> translateWord(String alienWord ) {	
		for(WordEnhanced p : d) {
			if(p.getAlienWord().equals(alienWord)) {
			return p.getTranslations();
		}
		
		}
		return null;
	}
}
