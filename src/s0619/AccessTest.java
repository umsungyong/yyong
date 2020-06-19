package s0619;

import s0619.suv.SubTest;

public class AccessTest {
       
	public static void main(String [] args) {
		SubTest st = new SubTest();
		st.num1 = 10;   //패키지가 다르면 public 빼곤 사용불가
		
	}
}
