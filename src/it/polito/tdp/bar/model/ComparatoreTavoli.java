package it.polito.tdp.bar.model;

import java.util.Comparator;

public class ComparatoreTavoli<T> implements Comparator<Table> {


	@Override
	public int compare(Table o1, Table o2) {
		
		return o1.getNumPosti()-o2.getNumPosti();
	}

	
	

}
