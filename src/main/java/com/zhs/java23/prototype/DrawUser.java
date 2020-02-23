package com.zhs.java23.prototype;

public class DrawUser implements Cloneable{
	
	private String name ;
	
	private String age;
	
	public DrawUser(){ 
		
	}

	public DrawUser(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DrawUser [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

}
