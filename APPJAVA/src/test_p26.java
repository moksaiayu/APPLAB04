
public class test_p26 {
public static void main(String[] args) {
	
	CarH cars[];
	cars = new CarH[2];
	
	cars[0] = new CarH();
	cars[1] = new RacingCarH();
	
	for(int i=0;i<cars.length;i++) {
		Class cl = cars[i].getClass();
		System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
	}
}
}

class CarH
{
	protected int num;
	protected double gas;
	
	public CarH() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}

class RacingCarH extends CarH{
	
	public RacingCarH() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}
