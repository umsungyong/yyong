package s0624;

import java.util.Random;

import java.util.Scanner;

public class GBB {

	public static void main(String[] args) {
		String[] strs = { "����", "����", "��" };
		Random r = new Random();
		int rNum = r.nextInt(3);
		System.out.print("����������! : ");
		Scanner s = new Scanner(System.in);
		String mine = s.nextLine();
		System.out.println(strs[rNum] + "," + mine);
		if (strs[rNum].equals(mine)) {
			System.out.println("�ܽ�~");
		} else {
			if ("����".equals(strs[rNum]))
				if ("����".equals(mine)) {
					System.out.println("�̱�");
				}

		}
	}

}
