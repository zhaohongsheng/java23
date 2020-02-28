package com.zhs.java23.bridge;

public class BridgeTest {
	
	public static void main(String[] args) {
		Implementor im = new ConcerImplementor();
		Abstraction ab = new Refbstraction(im);
		ab.open();
	}

}
