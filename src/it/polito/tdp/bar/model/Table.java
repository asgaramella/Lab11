package it.polito.tdp.bar.model;

public class Table {
	private int numPosti;
	private boolean libero;
	
	
	
	public Table(int numPosti) {
		super();
		this.numPosti = numPosti;
		this.libero=true;
	}


	/**
	 * @return the numPosti
	 */
	public int getNumPosti() {
		return numPosti;
	}


	/**
	 * @param numPosti the numPosti to set
	 */
	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}


	/**
	 * @return the libero
	 */
	public boolean isLibero() {
		return libero;
	}


	/**
	 * @param libero the libero to set
	 */
	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	
	
	
	

}
