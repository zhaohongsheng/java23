package com.zhs.java23.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		AbstracBuilder builder = new ConcreateBuilder();
		Directory dier = new Directory(builder);
		Product pro = dier.construct();
		pro.show();
		
		
	}

}
