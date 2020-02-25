package com.zhs.java23.builder;

public abstract class AbstracBuilder {
	
	protected  Product product = new Product();
	
	public abstract void buildPartA();
	
	public abstract void buildPartB();
	
	public abstract void buildPartC();

	public Product getProduct() {
		return product;
	}
	
	
}
