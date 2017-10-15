package com.joyiwendi.java_projects;

public class Main {
	
	//Component p1 = new Component();
	//p1.setDescription(Intel);
	//p1.setCost(200);
	
	
	

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		Computer c4 = new Computer();
		Computer c5 = new Computer();
		
		
		ComputerStore cs = new ComputerStore();
		 cs.addComputer(c1);
		 cs.addComputer(c2);
		 cs.addComputer(c3);
		 cs.addComputer(c4);
		 cs.addComputer(c5);

		cs.printTotalValue();
		//cs.printAllComputers();
			
		//cs.printTotalValue();		c
		
			
		
		
	}
	
}
