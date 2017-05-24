package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import it.polito.tdp.bar.model.Event.EventType;






public class Simulator {
	
	
	// stato del mondo
	private PriorityQueue<Gruppo> codaClienti;
	private int tavoliOccupati;
	
	
	//lista degli eventi
	private PriorityQueue<Event> listaEventi;
	
	
	private Statistiche st;
	private List<Table> tavoli;
	
	
	public Simulator() {
		super();
		this.codaClienti=new PriorityQueue<>();
		this.listaEventi=new PriorityQueue<>();
		this.tavoli=new ArrayList<>();
		st=new Statistiche();
		this.creaTavoli();
	}

	
	public void creaTavoli(){
		tavoli.add(new Table(10));
		tavoli.add(new Table(10));
		
		tavoli.add(new Table(8));
		tavoli.add(new Table(8));
		tavoli.add(new Table(8));
		tavoli.add(new Table(8));
		
		tavoli.add(new Table(6));
		tavoli.add(new Table(6));
		tavoli.add(new Table(6));
		tavoli.add(new Table(6));
		
		tavoli.add(new Table(4));
		tavoli.add(new Table(4));
		tavoli.add(new Table(4));
		tavoli.add(new Table(4));
		tavoli.add(new Table(4));
		
		Collections.sort(tavoli, new ComparatoreTavoli<Table>());
		
		
		
	}


	public void generaArrivi(){
		int time=0;
		for(int i=0;i<2000;i++){
		    time+=(int)(1+Math.random()*10);
		    int numPersone=(int)(1+Math.random()*10);
		    int durata=60+(int)(Math.random()*60+1);
		    float tolleranza=(float)Math.random();
		    	if(tolleranza>0.9)
		    		tolleranza=(float)0.9;
			Gruppo g=new Gruppo("Gruppo"+String.valueOf(i),numPersone,time,durata,tolleranza);
			st.setTotClienti(st.getTotClienti()+numPersone);
			codaClienti.add(g);
			Event e=new Event(g,time,EventType.IN);
			listaEventi.add(e);
			
		}
		System.out.println((this.codaClienti.toString()));
	}
	
	public void run() {
		while (!listaEventi.isEmpty()) {
			Event e = listaEventi.poll();
			

			switch (e.getType()) {
			case IN:
				processEventIngresso(e);
				break;
			case OUT:
				processEventUscita(e);
				break;
			}
			System.out.println(e);

		}
	}



	private void processEventUscita(Event e) {
		Gruppo g=e.getClienti();
		 g.getTavolo().setLibero(true);
		
		
		
	}



	private void processEventIngresso(Event e) {
		Gruppo g=e.getClienti();
		int numPers=e.getClienti().getNumPersone();
	 
		
		 boolean trovato=false;
		 for(Table ttemp:this.tavoli){
			 if(numPers>=0.5*ttemp.getNumPosti() && numPers<=ttemp.getNumPosti() && ttemp.isLibero()){
				 st.setClientiSoddisfatti(st.getClientiSoddisfatti()+numPers);
				 g.setTavolo(ttemp);
				 ttemp.setLibero(false);
				 
				 Event out=new Event(g,e.getTime()+g.getDurata(),EventType.OUT);
				 listaEventi.add(out);
				 
				 trovato=true;
				 break;
			 }
		}
		 
		 if(trovato==false){
			 if(calcolaProbabilita(g)){
				 st.setClientiSoddisfatti(st.getClientiSoddisfatti()+numPers);
			 }
			 else
				 st.setClientiInsoddisfatti(st.getClientiInsoddisfatti()+numPers);
		 }
		 
	 	
		
	}
	
	
	private boolean calcolaProbabilita(Gruppo g){
		boolean banconeOK=false;
		float f=(float)Math.random();
		
		//tolleranza è la probabilità di accettare
		//se f cade all'intreno della t allora ok
		//altrimenti cado nell'int in cui rifiuto !
		if(f<g.getTolleranza())
			banconeOK=true;
		
		return banconeOK;
	}


	public Statistiche getSt() {
		return st;
	}
	
	
	

}
