
public class test_p38 {
	public static void main(String[] args) {
		ivehicle[] ivc;
		ivc = new ivehicle[2];
		
		ivc[0] = new carK(12345, 20.5);
		ivc[1] = new planeB(232);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}

interface ivehicle{
	int weight = 1000;
	void show();
}

class carK implements ivehicle{
	private int num;
	private double gas;
	
	public carK(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
		
	}
}
class planeB implements ivehicle{
	private int flight;
	
	public planeB(int f) {
		flight = f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	public void show() {
		System.out.println("�������Z����"+flight);
	}
}