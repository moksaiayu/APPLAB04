
public class test_p41 {
	public static void main(String[] args) {
		carL car1 = new carL(1234, 20.5);
		car1.vshow();
		car1.mshow();
	}
}

interface ivehicleC{
	void vshow();
}

interface imaterial{
	void mshow();
}

class carL implements ivehicleC,imaterial{
	private int num;
	private double gas;
	
	public carL(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void vshow() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
	
	public void mshow() {
		System.out.println("車子的材質是鐵");
	}
}