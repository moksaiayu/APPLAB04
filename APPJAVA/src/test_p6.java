
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
		System.out.println("生產了車子");
	}
	
	public CarA(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}

class RacingCarA extends CarA{
	private int course;
	
	public RacingCarA() {
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCarA(int n, double g, int c) {
		super(n,g);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
		
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
}
