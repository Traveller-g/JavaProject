package com;

public class PC {
	
	CPU cpu;
	HardDisk disk;
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setDisk(HardDisk disk) {
		this.disk = disk;
	}
	
	void show() {
		System.out.println("CPU品牌："+cpu.getType());
		if(cpu.getRam()==32 || cpu.getRam()==64){
			System.out.println(cpu.getType()+"此品牌的CPU为："+cpu.getRam()+"位");
		}else{
			System.out.println(cpu.getType()+"品牌CPU"+cpu.getRam()+"位的不存在！！！");
		}
		System.out.println("CPU运行速度:"+cpu.getSpeed()+"转");
		
		System.out.println("-------------------------------");
		
		System.out.println("硬盘品牌:"+disk.getBrank());
		
		System.out.println("硬盘价格:"+disk.getAmount()+"人民币");
		
		if(disk.getRom()>=120 && disk.getRom()<=2048){
			System.out.println("此品牌硬盘内存大小为："+disk.getRom()+"GB");
		}else{
			System.out.println("此品牌硬盘内存"+disk.getRom()+"GB大小不存在！！！");
		}
	}

}
