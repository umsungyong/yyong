package s0619;

public class ArrayTest5 {
	public static void main(String[] args) {
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 3;
		}
		
		int[] tmpNums = nums;
		nums = new int[tmpNums.length+1];
        for (int i =0;i<tmpNums.length;i++) {
        	nums[i] = tmpNums[i];
        }
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
