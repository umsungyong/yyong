package s0624;

public class StringArray2 {

	public static void main(String[] args) {
		String str = "1,2,211,5,17,22,";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);

		}
		for (int num : nums) {

             
			System.out.println(num);
		}

	}


		
		

	}

