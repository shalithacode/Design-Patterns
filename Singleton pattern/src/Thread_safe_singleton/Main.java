package Thread_safe_singleton;

import Singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strart...");

		Thread thread1 = new Thread(new Thread1());
		thread1.run();

		for (int i = 0; i < 5; i++) {
			Singleton s = Singleton.getInstance();

		}
	}
}
