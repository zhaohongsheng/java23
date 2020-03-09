package com.zhs.java23.facade;

public class Facade {
	
	System01 s01;
	
	System02 s02;
	
	System03 s03;
	
	
	
	public Facade(System01 s01, System02 s02, System03 s03) {
		super();
		this.s01 = s01;
		this.s02 = s02;
		this.s03 = s03;
	}



	public void show(){
		s01.show();
		s02.show();
		s03.show();
	}


}
