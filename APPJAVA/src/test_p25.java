
public class test_p25 {
public static void main(String[] args) {
	
	CarG car1 = new CarG();
	CarG car2 = new CarG();
	
	CarG car3;
	car3 = car1;
	
	System.out.println("car1與car2相同"+car1.equals(car2));
	System.out.println("car1與car3相同"+car1.equals(car3));
}
}

class CarG
{
	protected int num;
	protected double gas;
	
	public CarG() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}