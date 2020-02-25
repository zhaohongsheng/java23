package com.zhs.java23.builder;

public class Product {
	
	private String partA;
	
	private String partB;
	
	private String partC;

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	
	public void show() {
		System.out.println("Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + "]");
	}
	
	

}
