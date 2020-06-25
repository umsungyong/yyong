package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ÇÐ»ý ¸î¸í? : ");
		int cnt = Integer.parseInt(scan.nextLine());
		List<Integer> intList = new ArrayList<>();
	    int min = 0;
	    int max = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println(i + "¹ø¤Š ÇÐ»ý Á¡¼ö´Â? : ");
			intList.add(Integer.parseInt(scan.nextLine()));
			if(i==0 || min>intList.get(i)) {
				min = intList.get(i);
			}
			if(i==0 || max<intList.get(i)){
				max = intList.get(i);
			}
		}
		System.out.println("Â¯ : " + max);
		System.out.println("ÂÉ·¦ :" + min);
	}
}
