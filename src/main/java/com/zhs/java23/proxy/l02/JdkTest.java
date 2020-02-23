package com.zhs.java23.proxy.l02;

import com.zhs.java23.proxy.base.SayHello;
import com.zhs.java23.proxy.base.SayHelloImpl;

public class JdkTest {
	

	
	public static void main(String[] args) {
		JdkProxyHello handler = new JdkProxyHello();
		SayHello sayHello = (SayHello) handler.bind(new SayHelloImpl());
		sayHello.say();
	}

}
