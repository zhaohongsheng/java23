package com.zhs.java23.adapter.l02;

import com.zhs.java23.adapter.Adaptee;
import com.zhs.java23.adapter.Target;

public class Adapter02 implements Target {

	private Adaptee adaptee;
	
	public Adapter02(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}



	public void twoCha() {
		
		adaptee.threeCha();
		
	}
	
	  

}
