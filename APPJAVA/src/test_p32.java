
public class test_p32 {
public static void main(String[] args) {
	
	vehicle[] vc;
	vc = new vehicle[2];
	
	vc[0] = new CarJ(1234, 20.5);
	vc[1] = new plane(232);
	
	for(int i=0;i<vc.length;i++) {
		if(vc[i] instanceof CarJ) {
			System.out.println("第"+(i+1)+"個物件是Car類別");
		}
		else {
			System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
	
}
}

abstract class vehicleA{
	protected int speed;
	public void setspeed(int s) {
		speed = s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}

class CarJ extends vehicle
{
	protected int num;
	protected double gas;
	
	public CarJ(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
		System.out.println("速度為"+speed);
	}
}

class planeA extends vehicle{
	private int flight;
	
	public planeA(int f) {
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show() {
		System.out.println("飛機的班次為"+flight);
		System.out.println("速度為"+speed);
	}
}
