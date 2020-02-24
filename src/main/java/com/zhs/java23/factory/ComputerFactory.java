package com.zhs.java23.factory;

public class ComputerFactory implements AbstractFactory{

	public Product product() {
		
		return new ComputerProduct();
	}

}
