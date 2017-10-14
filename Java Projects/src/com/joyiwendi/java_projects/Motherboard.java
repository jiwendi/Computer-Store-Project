package com.joyiwendi.java_projects;

public class Motherboard extends Component {

	private String form_factor; 
	private int slots;
	private String chipset;
	
	public Motherboard(int cost, String manufacturer, String form_factor, String chipset, int num_slots) {
		super(cost, manufacturer);
		this.form_factor = form_factor;
		this.chipset = chipset;
		this.slots = num_slots;
	}


	public String getForm_factor() {
		return form_factor;
	}


	public void setForm_factor(String form_factor) {
		this.form_factor = form_factor;
	}


	public String getChipset() {
		return chipset;
	}


	public void setChipset(String chipset) {
		this.chipset = chipset;
	}


	public int getSlots() {
		return slots;
	}


	public void setSlots(int slots) {
		this.slots = slots;
	}
	
	
		
}
