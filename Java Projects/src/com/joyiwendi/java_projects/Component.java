package com.joyiwendi.java_projects;

import java.util.Random;

public class Component {
		
		private int cost;
		private String manufacturer;
		
			
		//Constructors
		public Component(int cost, String manufacturer) {
			
	       	this.cost = cost;
			this.manufacturer = manufacturer;
						
}

		public int getCost() {
			return cost;
		}



		protected void setCost(int cost) {
			this.cost = cost;
		}



		public String getmanufacturer() {
			return manufacturer;
		}



		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}


}
		
		
		
		
		
		
		

