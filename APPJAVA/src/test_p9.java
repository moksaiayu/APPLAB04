
public class test_p9 {
public static void main(String[] args) {
	
	RacingCarB rccar1;
	rccar1 = new RacingCarB();
	rccar1.newShow();
}
}

class CarB
{
	protected int num;
	protected double gas;
	
	public CarB() {
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

class RacingCarB extends CarB{
	private int course;
	
	public RacingCarB() {
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void newShow() {
		System.out.println("�ɨ���������"+num);
		System.out.println("�T�o�q��"+gas);
		System.out.println("�ɨ��s����"+course);
	}
}
