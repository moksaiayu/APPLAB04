
public class test_p11 {
public static void main(String[] args) {
	
	RacingCarC rccar1;
	rccar1 = new RacingCarC();
	
	rccar1.setCar(1234, 20.5);
	rccar1.setCourse(5);
	
	rccar1.show();
}
}

class CarC
{
	protected int num;
	protected double gas;
	
	public CarC() {
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

class RacingCarC extends CarC{
	private int course;
	
	public RacingCarC() {
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
