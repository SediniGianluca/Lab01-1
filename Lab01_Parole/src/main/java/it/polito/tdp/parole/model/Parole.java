package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
		List<String> parole;
	public Parole() {
		this.parole=new ArrayList<String>();
	}
	
	public void addParola(String p) {
		this.parole.add(p);
	}
	
	public List<String> getElenco() {
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

}
