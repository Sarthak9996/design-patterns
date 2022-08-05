package singleton;

public class EagerInitilisation {
	public static void main(String[] args) {
		EagerSingleton instance = EagerSingleton.getInstance();
		System.err.println(instance);

		EagerSingleton instance1 = EagerSingleton.getInstance();
		System.err.println(instance1);
	}
}
