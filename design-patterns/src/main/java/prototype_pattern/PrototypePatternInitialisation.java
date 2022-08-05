package prototype_pattern;

import java.util.List;

public class PrototypePatternInitialisation {
	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle a = new Vehicle();
		a.insertData();

		Vehicle b = (Vehicle) a.clone();
		List<String> list = b.getVehicleList();
		list.add("Honda New Amaze");

		System.err.println(a.getVehicleList());
		System.err.println(list);

		b.getVehicleList().remove("Audi A4");
		System.err.println(list);

	}
}
