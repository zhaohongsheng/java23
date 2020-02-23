package com.zhs.java23.prototype;

public class PrototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		DrawUser drawUser = new DrawUser("张三","50");
		
		Draw draw = new Draw(drawUser);
		Draw draw1 = (Draw) draw.clone();
		draw1.getDrawUser().setAge("100");
		draw1.drew(20);
		draw.drew(10);
		
		Draw draw3 = (Draw) draw.sclone();
		draw3.getDrawUser().setAge("1000");
		draw1.drew(20);
		draw3.drew(20);
	}

}
