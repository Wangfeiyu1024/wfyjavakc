package computerw;

public class CPU {
    int speed;
    String type;  //CPU���ͺ�
    static int m;
    private double temperature;           //CPU���¶� CPU��˽�б����¶�  ֻ���ڸ�����ʹ��
    CPU(){
    	
    }
    
    CPU(int speed){
    	this.speed = speed;
    }
    
    CPU(int speed,String type,double temperature){
    	this.speed = speed;
    	this.type = type;
    	this.temperature = temperature;
    }                                   //���췽������ �β�������һ��
    
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;           //û��thisҲ���� ���ֲ�����ǰ���speed  ����this�Ϳ��Ե���ʵ����������
	}
    private  void judge(double temperature) {
    	 while(temperature >= 20 && temperature <= 30) {
    		System.out.println("cpu�¶�����");
    		//  break;                                 //����ѭ��
    	}
    }                                        // ˽�з���  �ж��Ƿ��¶�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpul = new CPU(4,"lntel",25);   //�ַ���������
		cpul.judge(cpul.temperature);
		System.out.println(cpul.type+"��cpu�¶�������"+"�¶���"+cpul.temperature); //������ʵ����.����   �ǵ�д+
	}

}
