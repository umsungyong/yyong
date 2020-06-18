package s0617;

public class MethodTest {
	/*
	 * 1. 같은 영역 내에 있어야 합니다. 2.메서드명이 같아야합니다. 3.파라메터의 갯수가 달라야 합니다. 4.피라메터의 갯수가
	 * 같더라도데이터 타입이 달라야 합니다. 5.파라미터의 갯수, 데이터 타입이 같더라도 위치가 달라야 합니다 .
	 */

	static int add(int num1, int num2) {

		return num1+num2;	
	}

	static String add(String str1,String str2) {
		return str1+str2;
	}
	
	
	public static void main(String[] args) {
		//int sum = add(1,2);
		System.out.println(add(1,2));
		System.out.println(add("아아아아","가가가"));
		
	}
}
