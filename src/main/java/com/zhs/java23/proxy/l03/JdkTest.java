package com.zhs.java23.proxy.l03;

import com.zhs.java23.proxy.base.SayHello;
import com.zhs.java23.proxy.base.SayHelloImpl;

public class JdkTest {
	

	
	public static void main(String[] args) {
		CGLibProxyHello handler = new CGLibProxyHello();
		SayHello sayHello = (SayHello) handler.bind(new SayHelloImpl());
		sayHello.say();
	}

}
