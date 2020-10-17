package com;

public class CPU {
	private int speed;		//cpu速度
	private String type;	//cpu类型
	private int ram;		//cpu内存
	
	CPU(int speed,String type,int ram){
		this.speed=speed;
		this.type=type;
		this.ram=ram;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	

}
