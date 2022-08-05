package singleton;

public class LazyInitilisation {
	public static void main(String[] args) {
		LazySingleton instance = LazySingleton.getInstance();
		System.err.println(instance);

		LazySingleton instance1 = LazySingleton.getInstance();
		System.err.println(instance1);
	}

}
