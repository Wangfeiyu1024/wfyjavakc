package computerw;

public class PC {
	CPU cpu;                      //���ͣ��൱��c���Ե�����)+����  �������� �������  �������֣�
    HardDisk HD;
    
    PC(){
    	
    }                            //���췽���������ֺ�����һ��   �޲ι��췽������
    
    PC(CPU cpu,HardDisk HD){
    	this.cpu = cpu; 
    	this.HD = HD;
    }                            //�вι��췽��  ʹ��this��ʾ���õ�ǰ����
    
	public void setCpu(CPU c) {
		this.cpu = c;            //��������ݷ�ʽ�Ҽ�source--getter and setter)
	} 

	public void setHD(HardDisk h) {
		HD = h;                 //����ͬ�ϣ�������Ҫ�� ������h��ֵ��ֵ��HD 
	}

	public void show() {       //����show ��д����Ҫ��+����+������+С���š���ͨ������������͡�
		System.out.println("cpu���ٶ���" + cpu.getSpeed());        //��ݷ�ʽSyso ��alt��/ 
		System.out.println("Ӳ�̵�������" + HD.getAmount());
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	}                                   //����ע�� ʹ��Ctrlt ��/

}
