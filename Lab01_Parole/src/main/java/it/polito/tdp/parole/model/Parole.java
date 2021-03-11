package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
		List<String> parole;
	public Parole() {
		this.parole=new ArrayList<String>();
	}
	
	public void addParola(String p) {
		this.parole.add(p);
		Collections.sort(parole);
	}
	
	public List<String> getElenco() {
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}
	public void cancella(String p) {
		parole.remove(p);
	}
}
