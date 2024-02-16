package com.objectiveDI;

public class Airtel {
	
	private Services service;

	public void setService(Services service) {
		this.service = service;
	}
	
	public void getService() {
		service.service();
	}

}
