
public class test_p14 {
public static void main(String[] args) {
	
	CarD car1;
	car1 = new RacingCarD();
	
	car1.setCar(1234, 20.5);
	
	car1.show();
}
}

class CarD
{
	protected int num;
	protected double gas;
	
	public CarD() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
	}
}

class RacingCarD extends CarD{
	private int course;
	
	public RacingCarD() {
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show() {
		System.out.println("�ɨ���������"+num);
		System.out.println("�T�o�q��"+gas);
		System.out.println("�ɨ��s����"+course);
	}
}
