
public class test_p6 {
public static void main(String[] args) {
	
	RacingCarA rccar1 = new RacingCarA(1234, 20.5, 5);
	
}
}

class CarA
{
	private int num;
	private double gas;
	
	public CarA() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public CarA(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
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

class RacingCarA extends CarA{
	private int course;
	
	public RacingCarA() {
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public RacingCarA(int n, double g, int c) {
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
		
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}
