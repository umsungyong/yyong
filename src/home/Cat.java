package home;

public class Cat extends Animal {
	     public void cry() {
	    	 System.out.println("¾ß¿Ë");
	    	 
		}
	     public static void main(String []args) {
	    	 Animal a = new Animal();
	    	 Cat c = new Cat();
	    	 a.cry();
	    	 c.cry();
	     }

}
