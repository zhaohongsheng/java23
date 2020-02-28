package com.zhs.java23.decorator;

public  class Decorator implements Component{

	private Component component;
	
	
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}



	public void open() {
		component.open();
		
	}

}
