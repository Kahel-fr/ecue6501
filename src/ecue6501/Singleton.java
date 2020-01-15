package ecue6501;

public class Singleton {
	
	static public Singleton instance;
	
	public Singleton() {
		System.out.println("Singleton constructed");
	}
	
	static public Singleton getInstance() {
		System.out.println("Singleton instance requested");
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void sayHelloWorld() {
		System.out.println("Hello world!");
	}
}