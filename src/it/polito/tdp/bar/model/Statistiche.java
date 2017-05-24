package it.polito.tdp.bar.model;

public class Statistiche {
	
	private int totClienti;
	private int clientiSoddisfatti;
	private int clientiInsoddisfatti;

	public Statistiche() {

		this.totClienti=0;
		this.clientiSoddisfatti=0;
		this.clientiInsoddisfatti=0;
		
	}

	public int getTotClienti() {
		return totClienti;
	}

	public void setTotClienti(int totClienti) {
		this.totClienti = totClienti;
	}

	public int getClientiSoddisfatti() {
		return clientiSoddisfatti;
	}

	public void setClientiSoddisfatti(int clientiSoddisfatti) {
		this.clientiSoddisfatti = clientiSoddisfatti;
	}

	public int getClientiInsoddisfatti() {
		return clientiInsoddisfatti;
	}

	public void setClientiInsoddisfatti(int clientiInsoddisfatti) {
		this.clientiInsoddisfatti = clientiInsoddisfatti;
	}
	
	
	

}
