package com.zhs.java23.builder;

public class ConcreateBuilder extends AbstracBuilder{

	@Override
	public void buildPartA() {
		
		product.setPartA("Builder A");
	}

	@Override
	public void buildPartB() {
		product.setPartB("Builder B");
		
	}

	@Override
	public void buildPartC() {
		product.setPartC("Builder C");
		
	}


}
