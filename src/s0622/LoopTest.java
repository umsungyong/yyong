package s0622;

public class LoopTest {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				n1 += i;
			} else {
				n2 += i;
			}
		}
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1 + n2);

	}
}
