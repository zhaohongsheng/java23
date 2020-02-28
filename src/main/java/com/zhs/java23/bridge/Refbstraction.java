package com.zhs.java23.bridge;

public class Refbstraction  extends Abstraction{

	public Refbstraction(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		
		System.out.println("====Refbstraction open ");
		implementor.open();
	}
	
	
	
	

}
