package singleton;

public class SynchronizedBlockSingleton {

	private static SynchronizedBlockSingleton instance;

	private SynchronizedBlockSingleton() {
	}

	public static synchronized SynchronizedBlockSingleton getInstance() {
		if (instance == null) {
			synchronized (SynchronizedBlockSingleton.class) {
				if (instance == null) {
					instance = new SynchronizedBlockSingleton();
				}
			}
		}
		return instance;
	}

}
