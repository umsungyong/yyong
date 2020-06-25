package homework;

public class Child extends Person{
      void eat() {
    	  System.out.println("먹고있습니다");
      }
      public static void main(String []args) {
    	  Person p = new Person();
    	  Child c = new Child();
    	  p.eat();
    	  c.eat();
    	   
    	  
      }
	 
	
}
