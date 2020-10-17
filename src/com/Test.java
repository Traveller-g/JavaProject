package com;

public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU(2200, "AMD", 32);
		
		HardDisk disk = new HardDisk(459, "西部数据", 500);
		
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	

}
