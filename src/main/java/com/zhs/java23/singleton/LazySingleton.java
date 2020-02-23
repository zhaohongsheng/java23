package com.zhs.java23.singleton;

public class LazySingleton {
	
	static volatile LazySingleton lazySingleton;
	
	public synchronized static LazySingleton getInstall(){
		
		if(lazySingleton == null){
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
		
	}

}
