package Singleton;

public class Singleton {

	private static Singleton instance = null;

	public Singleton() {
		System.out.println("Singleton object created");
	}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}

		return instance;
			}
}
