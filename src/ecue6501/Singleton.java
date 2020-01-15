package ecue6501;

public class Singleton {
	
	static public Singleton instance;
	
	public Singleton() {
		
	}
	
	static public Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void sayHelloWorld() {
		System.out.println("Hello world!");
	}

}
