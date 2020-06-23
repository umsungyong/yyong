package s0622;

public class IfTest {
	public static void main(String [] args) {
	   System.out.println("검증시작");
	   for (int i=1;i<10000;i++) {
	   double d = Math.random();
	   int num = (int)(d*20) + 1;
	     if(num>=1 && num<=20) {
        }else {
        	
        }
          System.out.println(num + " : 아아");
   
	   System.out.println("검증종료");
	   }
}
}