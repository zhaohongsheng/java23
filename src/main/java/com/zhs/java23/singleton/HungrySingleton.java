package com.zhs.java23.singleton;

public class HungrySingleton {
	
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	
	private HungrySingleton(){}


	private static HungrySingleton getInstall(){
		return hungrySingleton;
	}

}
