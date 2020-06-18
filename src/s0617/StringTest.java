package s0617;

public class StringTest {

	static int Length(String str) {
		 int cnt=0;
		 for(int i=0;i<str.length();i++){
			 System.out.print(str.charAt(i));
			 cnt++;
		 }
		 return cnt;
		}

	public static void main(String[] args) {
		String str = "123452";
		int cnt = Length (str);
		System.out.println();
		System.out.println("str의 글자수 : " + cnt);
	}
}
