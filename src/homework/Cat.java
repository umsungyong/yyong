package homework;

public class Cat extends Animal {

	void cry() {
		System.out.println("야용~");
	}

	public static void main(String[] args) {
	    	  Animal an = new Animal();
	    	  Cat c = new Cat(); 
	    	  
	    	  
	    	 an.cry();
	    	 c.cry();
	}
	 
}