package computerw;

//import testprivate.CPUT;                 //�������testprivate��CPUT��

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CPU cpu = new CPU();             //ʵ�������� ��ʽ  ���� ʵ�������� = new ����������
    cpu.setSpeed(2200);             //����ֵ ʵ����.���ý����ٶȷ�����ֵ��
    
    HardDisk disk = new HardDisk();
    disk.setAmount(200);
    
    PC pc = new PC();              //��Ϊû��ֵ����ֲ���  ռ���ڴ� ���Ծ���
    pc.setCpu(cpu);
    pc.setHD(disk);
    pc.show();
    
//  CPU cpu2 = new CPU();
//  cpu2.temperature(31);  //�¶���CPU��˽�б��� ��������������ʹ��
    
    //System.out.println(CPUT.temperature());  //��ͬ�����ܵ���˽�б���
    
	}
}
