package com.zhs.java23.proxy.l01;

import com.zhs.java23.proxy.base.SayHello;

public class ProxySay implements SayHello{
	
	private SayHello sayHello;
	

	public ProxySay(SayHello sayHello) {
		super();
		this.sayHello = sayHello;
	}



	public void say() {
		sayHello.say();
	}

	

}
