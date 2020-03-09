package com.zhs.java23.facade;

public class FacadeTest {
	
	public static void main(String[] args) {
		Facade fac = new Facade(new System01(), new System02(), new System03());
		fac.show();
	}
}
