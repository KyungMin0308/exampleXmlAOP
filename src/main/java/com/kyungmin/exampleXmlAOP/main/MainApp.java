package com.kyungmin.exampleXmlAOP.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//Spring Container 생성
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/kyungmin/exampleXmlAOP/conf/animal.xml");
		
		PetOwner petOwner = (PetOwner) context.getBean("id_petOwner");
		petOwner.play();
		
		context.close();

	}

}
