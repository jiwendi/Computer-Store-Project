package com.joyiwendi.java_projects;

public class HardDisk extends Component {
	private String rpm;
	private String cache_size;
	private String storage_size;
	
	
	
	
	public HardDisk(int cost, String manufacturer, String rpm, String cache_size, String storage_size) {
		super(cost, manufacturer);
		this.rpm = rpm;
		this.cache_size = cache_size;
		this.storage_size = storage_size;
		
	}


	public String getRpm() {
		return rpm;
	}


	
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}



	public String getCache_size() {
		return cache_size;
	}



	public void setCache_size(String cache_size) {
		this.cache_size = cache_size;
	}



	public String getStorage_size() {
		return storage_size;
	}



	public void setStorage_size(String storage_size) {
		this.storage_size = storage_size;
	}


   
	
	
	

	

}
