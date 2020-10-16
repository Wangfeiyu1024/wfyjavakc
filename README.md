# wfyjavakc
java实验1
# 实验名称
### 使用类描述计算机中CPU的速度和硬盘的容量
## 实验目的
1.掌握类的建立,属性的设置以及了解属性类型  
2.掌握方法（主方法,普通方法和构造方法）的建立，学会setSpeed(赋值）和getSpeed(返回)的方法建立以及使用show方法输出题所要求  
3.掌握主类调用其他类,实例化对象调用方法以及在类中定义方法操作属性  
4.熟悉private修饰符的使用和用法
## 实验内容
1.建立四个类（PC,CPU,HardDisk,Test[主类]），并在前三个类中设置相应的属性  
2.在CPU类和HardDisk类中设置set和get方法对其属性赋值和返回值  
3.在pc类中设置set方法对其属性赋值，在show方法调用其他类的get方法输出CPU的速度和硬盘的容量  
4.在test主类中实例化对象并调用前三个类的set方法设置值或者调用时使用实参  
5.定义多个类型属性以及构造方法并调用  
6.设置私有变量和私有方法，体会修饰符private的用法  
## 实验过程
1.建立一个包，在包中设置PC,CPU,HardDisk,主类Test  
2.在PC类下设置cpu和HD属性以及三个普通方法setCPU,setHardDisk,show  
3.在CPU类下设置speed属性以俩个普通方法setSpeed和getSpeed  
4.在HardDisk类下设置amount属性以俩个普通方法setAmount和getAmount  
5.在Test类中实例化对象cpu,disk,pc；给对象cpu,disk设置值；pc调用setCPU,setHardDisk，show方法，调用时使用实参cpu,disk
6.设置私有变量temperature和私有方法judge，并调用测试
7.测试在其他类中调用私有变量temperature和不同包调用私有方法
## 核心方法
（1）设置属性  
```
 String type;
```
（2）构造方法  
```
CPU(int speed,String type,double temperature){
    	this.speed = speed;
    	this.type = type;
    	this.temperature = temperature;
    }       
```
（3）set和get方法的建立  
```
public int getAmount() {
		return amount;
	}

	public void setAmount(int m) {
		this.amount = m;
	}
```
（4）实例化对象以及赋值和实参调用    
```
 CPU cpu = new CPU();             
 cpu.setSpeed(2200); 
 pc.setCpu(cpu);
 ```
（5）私有变量和逻辑判断私有方法的设置    
```
private double temperature;   
private  void judge(double temperature) {
    	 while(temperature >= 20 && temperature <= 30) {
    		System.out.println("cpu温度正常");
    		 break;                               
    	}
```
 (6)调用方法输出结果   
```
 public void show() {       
		System.out.println("cpu的速度是" + cpu.getSpeed());        
		System.out.println("硬盘的容量是" + HD.getAmount());
	}
```
## 实验结果
（1）Test类运行结果    
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/ruAMsa53pVQWN7FLK88i5vA77hWdJxUsf*8Lxq0GZrdnTwIsR689bLoI65*3guWPL5Zy.6nUIRIl1HCP86b5kVkW1IpIIVxous7eMc*RRmE!/b&bo=nwIHAQAAAAADB7k!&rf=viewer_4)   
（2）CPU类逻辑方法的判断结果    
![alt console](http://m.qpic.cn/psc?/V528qTS74BHGMM1h1AFf33VeSW0R67RO/ruAMsa53pVQWN7FLK88i5vA77hWdJxUsf*8Lxq0GZre1GGsz2Q1O*3l0gGeMH8gdvsPkF*.t*U2gPQylFyAOUSHNZqfotc2zrwk3LUTSe2g!/b&bo=nwIHAQAAAAADB7k!&rf=viewer_4) 
## 实验感想
  通过此次实验了解如何建立类和方法，并在主类中实例化对象调用其他类。熟悉了private修饰符访问权限，只能在同一类中使用。也掌握主方法,普通方法和构造方法的建立及调用赋值。
