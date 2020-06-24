package s0622;

import java.util.Random;

import java.util.Scanner;

public class NumBaseBall {
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(10);
		Scanner s = new Scanner(System.in);
		System.out.print("¸ÂÃçº¸·»°¡~~? : ");
		String numStr = s.nextLine();
		while(!numStr.contentEquals(rNum+"")) {
			System.out.print("Æ²·È¾î´Ù½Ã! : ");
			numStr = s.nextLine();
		}
		System.out.printf("rNum=%d, ´Ï´ë´ä=%s", rNum, numStr);
	     
		
		
		
}
}