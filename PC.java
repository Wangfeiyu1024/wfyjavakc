package computerw;

public class PC {
	CPU cpu;                      //类型（相当于c语言的整型)+属性  创建对象（ 类的名字  对象名字）
    HardDisk HD;
    
    PC(){
    	
    }                            //构造方法方法名字和类名一样   无参构造方法重载
    
    PC(CPU cpu,HardDisk HD){
    	this.cpu = cpu; 
    	this.HD = HD;
    }                            //有参构造方法  使用this表示调用当前对象
    
	public void setCpu(CPU c) {
		this.cpu = c;            //方法（快捷方式右键source--getter and setter)
	} 

	public void setHD(HardDisk h) {
		HD = h;                 //建立同上；根据题要求 将参数h的值赋值给HD 
	}

	public void show() {       //建立show 先写访问要求+类型+方法名+小括号【普通方法必须加类型】
		System.out.println("cpu的速度是" + cpu.getSpeed());        //快捷方式Syso 按alt加/ 
		System.out.println("硬盘的容量是" + HD.getAmount());
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}                                   //多行注释 使用Ctrlt 加/

}
