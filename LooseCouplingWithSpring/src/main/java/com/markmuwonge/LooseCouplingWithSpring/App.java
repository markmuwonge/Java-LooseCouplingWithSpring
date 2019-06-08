package com.markmuwonge.LooseCouplingWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SelectedService selectedService = context.getBean("selectedServiceObj", SelectedService.class);
		selectedService.activateService();
	}
}
