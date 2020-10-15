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
2.在PC下设置cpu和HD
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


## 实验结果
## 实验感想
