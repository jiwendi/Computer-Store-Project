package com.joyiwendi.java_projects;

public class Display extends Component {
	private String size;
	private String port;
	private String color;
		
	

	public Display(int cost, String manufacturer, String size, String port, String color) {
		super(cost, manufacturer);
		this.size = size;
		this.port = port;
		this.color = color;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public String getPort() {
		return port;
	}



	public void setPort(String port) {
		this.port = port;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}

		
}
