#Java应用程序有4个类名称分别是PC，CPU，HardDisk和Test，其中Test是主类<br>
---
___#程序要求<br>___
1.CPU要求getSpeed()返回Speed的值，要求setSpeed(int m)方法将参数m的值赋值给Speed;<br>
2.HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount;<br>
3.PC类要求setCPU(CPU c)将参数c的值赋值费cpu，要求setHardDisk(HardDisk h)方法将参数h值赋值费HD，要求show()方法能显示cpu的速度和硬盘的容量;<br>
___#主类Test的要求<br>___
1.main方法中创建一个CPU对象cpu，cpu将知己的speed设置为2200;<br>
2.main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200;<br>
3.main方法中创建一个PC对象pc;<br>
4.pc调用setCPU(CPU c)方法，调用实时参是cpu;<br>
5.pc调用setHardDisk(HardDisk h)方法，调用实时参是disk;<br>
6.pc调用show()方法;<br>
___#附加要求<br>___
(a)类中定义不少于两个构造方法;<br>
(b)每个类定义不少于2个属性，且属性的类型应该多样化;<br>
(c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断;<br>
(d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法;<br>
___#实验设计UML构图___<br>
![UML图](https://github.com/Traveller-g/JavaProject/blob/main/img/uml%E5%BB%BA%E6%A8%A1.jpg)<br><br>
___#核心代码___<br>
HardDisk | CPU | PC
---- | ----- | ------
```
//HardDisk 构造方法：将形参的值赋值给实参
HardDisk(int amount,String brank,int rom){
		this.amount=amount;
		this.brank=brank;
		this.rom=rom;
		
	}
```
```
/**
CPU 调用set/get方法
作用：set()是给属性赋值的，get()是获取属性值的，被设置和存取的属性一般是私有；
主要是起到封装的作用，不允许直接对属性操作，一般set()和get()不一定同时存在；
*/
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
```
```
//自定义无返回值函数，该程序是完成输出操作；
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
```
```
	//程序主函数为cpu && disk设置值，并通过pc输出;
	public static void main(String[] args) {
		CPU cpu = new CPU(2200, "AMD", 32);
		HardDisk disk = new HardDisk(459, "西部数据", 500);
		PC pc = new PC();
		pc.setCpu(cpu);
		pc.setDisk(disk);
		pc.show();
	}
	
```
___#程序运行结果___<br>
![运行结果](https://github.com/Traveller-g/JavaProject/blob/main/img/1602919158.jpg)
