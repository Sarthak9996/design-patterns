package factory_design;

public class VehicleFactory {
	public static Vehicle getInstance(String type, int wheel) {
		if ("car".equalsIgnoreCase(type)) {
			return new Car(wheel);
		} else if ("bike".equalsIgnoreCase(type)) {
			return new Bike(wheel);
		}

		return null;
	}
}
