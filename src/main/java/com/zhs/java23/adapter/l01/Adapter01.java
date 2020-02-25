package com.zhs.java23.adapter.l01;

import com.zhs.java23.adapter.Adaptee;
import com.zhs.java23.adapter.Target;

public class Adapter01 extends Adaptee implements Target{

	public void twoCha() {
		
		this.threeCha();
		
	}

}
