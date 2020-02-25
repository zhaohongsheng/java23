package com.zhs.java23.adapter;

import com.zhs.java23.adapter.l01.Adapter01;
import com.zhs.java23.adapter.l02.Adapter02;

public class AdapterTest {
	
	public static void main(String[] args) {
		
		//01
		Target tar = new Adapter01();
		tar.twoCha();
		//02
		Target tar1 = new Adapter02(new Adaptee());
		tar1.twoCha();
		
	}

}
