package com.kyungmin.exampleXmlAOP.main;

public class Logger { //Aspect 클래스

	public void aboutToSound() {
		System.out.println("advice[before]: about to sound");
	}
}
