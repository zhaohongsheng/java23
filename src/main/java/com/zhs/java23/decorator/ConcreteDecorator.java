package com.zhs.java23.decorator;

public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void open() {
		super.open();
		doOther();
	}

	public void doOther() {
		System.out.println("===== do other");
		
	}
	
	
	
}
