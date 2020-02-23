package com.zhs.java23.prototype;

public class Draw implements Cloneable{
	
	private DrawUser drawUser;
	
	public Draw(DrawUser drawUser) {
		super();
		this.drawUser = drawUser;
	}
	

	public DrawUser getDrawUser() {
		return drawUser;
	}



	public void setDrawUser(DrawUser drawUser) {
		this.drawUser = drawUser;
	}



	public void drew(int len){
		System.out.println("draw user :"+drawUser.toString());
		System.out.println(" draw :"+len+" over");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return this;
	}
	
	
	protected Object sclone() throws CloneNotSupportedException {
		Draw draw = (Draw) super.clone();
		
		draw.setDrawUser((DrawUser) draw.getDrawUser().clone());
		
		return draw;
	}

}
