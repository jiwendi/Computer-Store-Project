package com.joyiwendi.java_projects;

import java.util.ArrayList;


public class ComputerStore {
					
	private ArrayList<Computer>computers;

	public ComputerStore() {
		super();
		computers = new ArrayList<>();
	}
		
	
	
	public boolean addComputer(Computer newComputer) {
			return computers.add(newComputer);	
	
	}

	public  Computer removeComputer(int index) {
		return computers.remove(index);
		
	}

	public void printAllComputers( ) {
		// prints out all the details of each computer in store
		for(Computer c : computers) {
			c.printSummary();
		}
	}

	public void printTotalValue( ) {
		// prints the total cost for all computers
		
		for(int i = 0; i<computers.size(); i++) {
		  for(Computer c : computers) {
			int total = 0;
			total = total + c.getTotalValue();	
			System.out.println(total);
		  }
		}
	} 
}
