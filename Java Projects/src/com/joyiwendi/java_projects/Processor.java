package com.joyiwendi.java_projects;

public class Processor extends Component {
	private String socket;
	private int clock_speed;
	private String cache_size;
	private String processor_size;
	

	public Processor(int cost, String manufacturer, String socket, int clock_speed, String cache_size, String processor_size) {
		super(cost, manufacturer);
		this.socket = socket;
		this.clock_speed = clock_speed;
		this.cache_size = cache_size;
		this.processor_size = processor_size;
		
	}
	

		

	public String getSocket() {
		return socket;
	}


	public void changeSocket(String socket) {
		this.socket = socket;
	}


	public int getClock_speed() {
		return clock_speed;
	}


	public void changeClock_speed(int clock_speed) {
		this.clock_speed = clock_speed;
	}


	public String getCache_size() {
		return cache_size;
	}


	public void changeCache_size(String cache_size) {
		this.cache_size = cache_size;
	}


	public String getProcessor_size() {
		return processor_size;
	}


	public void changeProcessor_size(String processor_size) {
		this.processor_size = processor_size;
	}
	
	
		
}
