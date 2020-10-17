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
