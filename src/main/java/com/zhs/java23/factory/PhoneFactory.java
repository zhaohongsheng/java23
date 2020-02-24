package com.zhs.java23.factory;

public class PhoneFactory implements AbstractFactory{
	

	public Product product() {
		
		
		return new PhoneProduct();

		
	}


}
