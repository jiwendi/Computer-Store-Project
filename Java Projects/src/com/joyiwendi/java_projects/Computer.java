package com.joyiwendi.java_projects;

public class Computer {

	private Processor processor;
	private HardDisk hardDisk;
	private Display display;
	private Motherboard motherboard;


 	public Computer() {
		
	    processor = new Processor(600,"Intel ","ReoFX ", 112, "15rpm ", "250nm ");
		hardDisk = new HardDisk(1200, "Seagat", "1200 rpm", "20gb", "2Tb ");
		display = new Display(1450,"LG ", "27 inch ","HDMI","black ");
		motherboard = new Motherboard(2473,"ASUS ","H270F ","ROG Strix ",17);
	
		}
 	public int getTotalValue() {
		int total = motherboard.getCost()+display.getCost()+hardDisk.getCost()+processor.getCost();
 		return total;
 		
 	}
		
 	public void printSummary() {
 		
 		System.out.println("=============================================================================================================\n");
 		System.out.println("******************************Summary Of your computer Details & Total Cost**********************************\n");
 		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
 		System.out.println("******** Processor: " + "Manufacturer: " + processor.getmanufacturer() +"," + " Socket: "+ processor.getSocket() + ","  + " Clock Speed: " + processor.getClock_speed() + "," + " Cost $:"+ processor.getCost() + "\n");
 		System.out.println("******** HardDisk: " + "Manufacturer: " + hardDisk.getmanufacturer() +"," + " Storage Size: "+ hardDisk.getStorage_size() + ","  + " Cache Size: " + hardDisk.getCache_size() + "," + " Cost $:"+ hardDisk.getCost() + "\n");
 		System.out.println("******** Display: " + "Manufacturer: " + display.getmanufacturer() +"," + " Size: "+ display.getSize() + ","  + " Port: " + display.getPort() + "," + " Cost $:"+ display.getCost() + "\n");
 		System.out.println("******** Motherboard: " + "Manufacturer: " + motherboard.getmanufacturer() +"," + " Chipset: "+ motherboard.getChipset() + ","  + " Slots: " + motherboard.getSlots() + "," + " Cost $:"+ motherboard.getCost() + "\n");
 		System.out.println("--------------------------------------------------------------------------------------------------------------\n");
 		System.out.println("*********TOTAL COST OF COMPUTER $ "+(motherboard.getCost()+display.getCost()+hardDisk.getCost()+processor.getCost()));
 		System.out.println("==============================================================================================================\n");
 		
 	
 	}
 		
 		
} 
		

 	