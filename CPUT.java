package testprivate;

public class CPUT {
    int speed;
    String type;                //CPU���ͺ�
    private double temperature;           //CPU���¶� CPU��˽�б����¶�  ֻ���ڸ�����ʹ��
    CPUT(){
    	
    }
    
    CPUT(int speed){
    	this.speed = speed;
    }
    
    CPUT(int speed,String type,double temperature){
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
    private void judge(double temperature) {
    	while(temperature == 20 && temperature == 30) {
    		System.out.println("cpu�¶�����");
    	}
    }                                        // ˽�з���  �ж��Ƿ��¶�����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPUT cpul = new CPUT(4,"lntel",25.9);   //�ַ���������
		cpul.judge(cpul.temperature);
		System.out.println(cpul.type+"��cpu�¶�������"+"�¶���"+cpul.temperature); //������ʵ����.����   �ǵ�д+
	}

}