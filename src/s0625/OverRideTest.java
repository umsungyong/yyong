package s0625;

import s0619.suv.SubTest;

class Test1 {

	public void eat() {
		System.out.println("すす");
	}
}

class subTest extends Test1 {
	public void eat() {
		System.out.println("けけ");

	}
}

public class OverRideTest {

	public static void main(String[] args) {
              Test1 t = new subTest();
              
              t.eat();
              System.out.println(t);
            
	}
}
