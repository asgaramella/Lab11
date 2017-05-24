package it.polito.tdp.bar.model;

public class Gruppo implements Comparable<Gruppo>{
	
	private String name;
	private int numPersone;
	private Table tavolo;
	private float tolleranza;
	private int queueTime;
	private int durata;
	
	public Gruppo(String name,int num, int queueTime, int durata,float tolleranza) {
		super();
		this.name = name;
		this.numPersone=num;
		this.queueTime = queueTime;
		this.durata=durata;
		this.tolleranza=tolleranza;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPersone() {
		return numPersone;
	}

	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}

	public Table getTavolo() {
		return tavolo;
	}

	public void setTavolo(Table tavolo) {
		this.tavolo = tavolo;
	}

	public float getTolleranza() {
		return tolleranza;
	}

	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}

	public int getQueueTime() {
		return queueTime;
	}

	public void setQueueTime(int queueTime) {
		this.queueTime = queueTime;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	@Override
	public int compareTo(Gruppo other) {
	
		return this.queueTime-other.queueTime;
	}

	public Gruppo(String name, int numPersone, Table tavolo, float tolleranza, int queueTime, int durata) {
		super();
		this.name = name;
		this.numPersone = numPersone;
		this.tavolo = tavolo;
		this.tolleranza = tolleranza;
		this.queueTime = queueTime;
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Gruppo [name=" + name + ", numPersone=" + numPersone + ", tavolo=" + tavolo + ", tolleranza="
				+ tolleranza + ", queueTime=" + queueTime + ", durata=" + durata + "]\n";
	}

	
	
	
	
	
	

}
