package factory_design;

public class Car extends Vehicle {
	int wheel;

	Car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public int getWheel() {
		return this.wheel;
	}
}
