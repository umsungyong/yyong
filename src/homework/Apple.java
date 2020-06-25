package homework;

public class Apple extends SmartPhone {

	public void calling() {
		System.out.println("전화받았습니다");
	}

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		Apple a = new SmartPhone();
        sm.calling();
        a.calling();
	}
}