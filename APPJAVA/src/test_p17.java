
public class test_p17 {
public static void main(String[] args) {
	
	CarE cars[];
	cars = new CarE[2];
	
	cars[0] = new CarE();
	cars[0].setCar(1234, 20.5);
	
	cars[1] = new RacingCarE();
	cars[1].setCar(4567, 30.5);
	
	for(int i=0;i<cars.length;i++) {
		cars[i].show();
	}
}
}

class CarE
{
	protected int num;
	protected double gas;
	
	public CarE() {
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

class RacingCarE extends CarE{
	private int course;
	
	public RacingCarE() {
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
