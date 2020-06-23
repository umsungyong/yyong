package s0622;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = (i * 3) + 1 + j;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("nums[%d][%d]=%d\r", i, j, nums[i][j]);
			}
		}
	}

}
