package factory_design;

public class FactoryPatternInitialisation {
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("car", 4);
		System.err.println(car);

		Vehicle bike = VehicleFactory.getInstance("bike", 2);
		System.err.println(bike);
	}
}
