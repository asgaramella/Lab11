package it.polito.tdp.bar.model;

public class Model {
	
	private Simulator sim;
	
	public Statistiche startSimulazione(){
		sim=new Simulator();
		sim.generaArrivi();
		sim.run();
		return sim.getSt();
		
		
	}

}
