package testprivate;

public class CPUT {
    int speed;
    String type;                //CPU的型号
    private double temperature;           //CPU的温度 CPU的私有变量温度  只能在该类中使用
    CPUT(){
    	
    }
    
    CPUT(int speed){
    	this.speed = speed;
    }
    
    CPUT(int speed,String type,double temperature){
    	this.speed = speed;
    	this.type = type;
    	this.temperature = temperature;
    }                                   //构造方法重载 形参数量不一样
    
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;           //没有this也可以 区分参数和前面的speed  有了this就可以调用实例化对象了
	}
    private void judge(double temperature) {
    	while(temperature == 20 && temperature == 30) {
    		System.out.println("cpu温度正常");
    	}
    }                                        // 私有方法  判断是否温度正常
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPUT cpul = new CPUT(4,"lntel",25.9);   //字符串带引号
		cpul.judge(cpul.temperature);
		System.out.println(cpul.type+"的cpu温度正常，"+"温度是"+cpul.temperature); //调用用实例化.属性   记得写+
	}

}