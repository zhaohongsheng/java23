package com.zhs.java23.builder;

public class Directory {
	
	private AbstracBuilder builder;

	public Directory(AbstracBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public Product construct(){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getProduct();
	}

}
