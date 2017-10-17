package com.joyiwendi.java_projects;

import java.util.Random;

public class Computer {

	private Processor processor;
	private HardDisk hardDisk;
	private Display display;
	private Motherboard motherboard;


 	public Computer() {
 		
 		//Creating random cost for each component .used for testing purposes only
 		Random rcost = new Random();
        int rand = rcost.nextInt(2000);
        Random rcost1 = new Random();
        int rand1 = rcost.nextInt(850);
        Random rcost2 = new Random();
        int rand2 = rcost.nextInt(4000);
        Random rcost3 = new Random();
        int rand3 = rcost.nextInt(1200);
 		        
 		processor = new Processor(rand,"Intel ","ReoFX ", 112, "15rpm ", "250nm ");
		hardDisk  = new HardDisk(rand1, "Seagat", "1200 rpm", "20gb", "2Tb ");
		display  = new Display(rand2,"LG ", "27 inch ","HDMI","black ");
		motherboard = new Motherboard(rand3,"ASUS ","H270F ","ROG Strix ",17);
	
				
		}
 	public int getTotalValue() {
		int total = motherboard.getCost()+display.getCost()+hardDisk.getCost()+processor.getCost();
 		return total;
 		
 	}
		
 	public void printSummary() {
 		
 		 		
 		System.out.println("=============================================================================================================\n");
 		System.out.println("******************************Summary Of your computer Details & Total Cost Of Computer**********************\n");
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
		

 	