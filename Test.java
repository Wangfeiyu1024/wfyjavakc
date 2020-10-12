package computerw;

//import testprivate.CPUT;                 //导入包中testprivate的CPUT类

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CPU cpu = new CPU();             //实例化对象 格式  类名 实例化名字 = new 类名（）；
    cpu.setSpeed(2200);             //设置值 实例化.调用建立速度方法（值）
    
    HardDisk disk = new HardDisk();
    disk.setAmount(200);
    
    PC pc = new PC();              //因为没赋值会出现波浪  占用内存 所以警告
    pc.setCpu(cpu);
    pc.setHD(disk);
    pc.show();
    
//  CPU cpu2 = new CPU();
//  cpu2.temperature(31);  //温度是CPU的私有变量 不能在其他类中使用
    
    //System.out.println(CPUT.temperature());  //不同包不能调用私有变量
    
	}
}
