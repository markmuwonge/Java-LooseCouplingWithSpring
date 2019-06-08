package com.markmuwonge.LooseCouplingWithSpring;

public class SelectedService {
	
	private Service service;
	
	
	public void setService(Service service) {
		this.service = service;
	}
	
	
	public void activateService()
	{
		service.service();
	}
}
