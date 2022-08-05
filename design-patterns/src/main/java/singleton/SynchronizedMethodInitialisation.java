package singleton;

public class SynchronizedMethodInitialisation {
	public static void main(String[] args) {

		SynchronizedMethodSingleton instance = SynchronizedMethodSingleton.getInstance();
		System.err.println(instance);

		SynchronizedMethodSingleton instance1 = SynchronizedMethodSingleton.getInstance();
		System.err.println(instance1);

	}
}
