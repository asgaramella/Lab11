package it.polito.tdp.bar.model;



public class Event implements Comparable<Event> {

	public enum EventType{ IN,OUT};
	
	private Gruppo clienti;
	private int time ;
	private EventType type ;
	
	
	
	
	public Event(Gruppo clienti, int time, EventType type) {
		super();
		this.clienti = clienti;
		this.time = time;
		this.type = type;
	}
	
	




	public Gruppo getClienti() {
		return clienti;
	}






	public void setClienti(Gruppo clienti) {
		this.clienti = clienti;
	}






	public int getTime() {
		return time;
	}






	public void setTime(int time) {
		this.time = time;
	}






	public EventType getType() {
		return type;
	}






	public void setType(EventType type) {
		this.type = type;
	}






	@Override
	public int compareTo(Event other) {
	
		return this.time-other.time;
	}






	@Override
	public String toString() {
		return "Event [clienti=" + clienti + ", time=" + time + ", type=" + type + "]";
	}
	
	

}
