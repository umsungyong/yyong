package s0624;

public class StringArray3 {
           
	public static void main(String[] args) {
		String str = "1,2,211,5,17,22,";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			int num = Integer.parseInt(strs[i]);
             if(num%2==0) {
            	 nums[i] = num;
             }
		}
		for (int num : nums) {
             
			System.out.println(num);
		}

	}
}

<<<<<<< HEAD
/*   class father      son extends father
 * String name;
 *
public void work() {
	System.out.println(" ");
 *
 */
=======


>>>>>>> branch 'master' of https://github.com/umsungyong/yyong.git


