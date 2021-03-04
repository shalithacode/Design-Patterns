package Thread_safe_singleton;

import Singleton.Singleton;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {

			Singleton s = Singleton.getInstance();

		}
	}
}
