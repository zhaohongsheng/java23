package com.zhs.java23.decorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Component com = new ConcreteComponent();
		
		Decorator de = new ConcreteDecorator(com);
		de.open();
	}

}
