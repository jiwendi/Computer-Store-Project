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
		
	

	public int printTotalValue( ) {
		// prints the total cost for all computers
		int total = 0;
		int cost = 0;
		for(int i = 0; i<computers.size(); i++) {
		  for(Computer c : computers) {
			 cost = c.getTotalValue();
		 }
		  total = total + cost;	
		}
		 return total;
	} 
	
	// This version will use a traditional for loop
	public Computer findMostExpensiveComputerV1() {
		Computer mostExpensive = computers.get(0);
		
		for(int i = 0; i<computers.size(); i++) {
		  if (mostExpensive.getTotalValue() < computers.get(i).getTotalValue()) {
			  mostExpensive = computers.get(i);
			  
	  }
		
	 }
		 return mostExpensive;
	}
	
	
	// This version will use a traditional while loop
	public Computer findMostExpensiveComputerV2() {
		
		Computer mostExpensive = computers.get(0);
		int i = 0;
		while(i < computers.size()){
			
			if(mostExpensive.getTotalValue() < computers.get(i).getTotalValue());
			 mostExpensive = computers.get(i);
			
		}	
		return mostExpensive;
		
		}
	
	


}
