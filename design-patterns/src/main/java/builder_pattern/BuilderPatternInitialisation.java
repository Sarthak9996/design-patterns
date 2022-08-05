package builder_pattern;

public class BuilderPatternInitialisation {
	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(4).build();
		Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

		System.err.println(car.getEngine());
		System.err.println(car.getWheel());
		System.err.println(car.getAirbags());

		System.err.println(bike.getEngine());
		System.err.println(bike.getWheel());
		System.err.println(bike.getAirbags());
	}
}
