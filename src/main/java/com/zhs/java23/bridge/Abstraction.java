package com.zhs.java23.bridge;

public abstract class Abstraction {
	
	protected Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}

	public abstract void open();
	
	

}
