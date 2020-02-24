package com.zhs.java23.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		AbstractFactory phone = new PhoneFactory();
		AbstractFactory comp = new ComputerFactory();
		
		phone.product();
		comp.product();
	}

}
