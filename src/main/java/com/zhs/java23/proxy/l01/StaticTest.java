package com.zhs.java23.proxy.l01;

import com.zhs.java23.proxy.base.SayHello;
import com.zhs.java23.proxy.base.SayHelloImpl;

public class StaticTest {
	
	public static void main(String[] args) {
		
		SayHello sayHello = new SayHelloImpl();
		SayHello say = new ProxySay(sayHello);
		say.say();
		
	}

}
