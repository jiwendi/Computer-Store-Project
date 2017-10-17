package com.joyiwendi.java_projects;

public class Main {
	
	/*
	 * This main class is used for testing all the setup from other classes
	 */

	public static void main(String[] args) {
		
		
		
		// setting up computers
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();
		Computer c5 = new Computer();
		
		//Adding computers to the ArrayList of computers in the Computer Store
		ComputerStore cs = new ComputerStore();
		 cs.addComputer(c1);
		 cs.addComputer(c2);
		 cs.addComputer(c3);
		 cs.addComputer(c4);
		 cs.addComputer(c5);

		 //printing the total value
		 int total = cs.printTotalValue();
		System.out.println("The total value of all computers in the store is: $" + total);
		
		//Print a summary of all computers
				cs.printAllComputers();
				
				
				// find most extensive computer with for loop
				cs.findMostExpensiveComputerV1();
				
				
				
				// find most extensive computer with while loop
				cs.findMostExpensiveComputerV2();
			
	
			
		
		
	}
	
}
