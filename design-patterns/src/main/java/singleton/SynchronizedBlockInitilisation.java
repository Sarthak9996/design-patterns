package singleton;

public class SynchronizedBlockInitilisation {
	public static void main(String[] args) {
		SynchronizedBlockSingleton instance = SynchronizedBlockSingleton.getInstance();
		System.err.println(instance);

		SynchronizedBlockSingleton instance1 = SynchronizedBlockSingleton.getInstance();
		System.err.println(instance1);
	}

}
