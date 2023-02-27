package practice;

public class Inheritance_P1 {

	public static void main(String[] args) {
		
		Car Stinger = new Car(100);
		HybridCar lexus = new HybridCar(120, 40);
		WaterHybridCar Samsung = new WaterHybridCar(30, 20, 60);
		Stinger.showCurrentGause();
		System.out.println();
		lexus.showCurrentGause();
		System.out.println();
		Samsung.showCurrentGause();
	}
}

class Car {
	int gasGause;
	
	public Car(int gasGause) {
		this.gasGause = gasGause;
	}
	
	public void showCurrentGause() {
		System.out.println("잔여 가솔린 : " + gasGause);
	}
}

class HybridCar extends Car{
	int electricGause;
	
	public HybridCar(int gasGause, int electricGause) {
		super(gasGause);
		this.electricGause = electricGause;
	}
	
	public void showCurrentGause() {
		super.showCurrentGause();
		System.out.println("잔여 전력량 : " + electricGause);
	}
}

class WaterHybridCar extends HybridCar{
	int waterGause;
	
	public WaterHybridCar(int gasGause, int electricGause, int waterGause) {
		super(gasGause, electricGause);
		this.waterGause = waterGause;
	}
	
	public void showCurrentGause() {
		super.showCurrentGause();
		System.out.println("잔여 워터량 : " + waterGause);
	}
}