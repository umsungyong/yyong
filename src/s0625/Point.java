package s0625;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("�� ���� �Է��ع�~ :" );
		String pointStr = scan.nextLine();
		int point = -1;
		while(point<0) {
		try {
			point = Integer.parseInt(pointStr);
		} catch (Exception e) {
            System.out.println("�Է��Ͻ� ������ ���� �� �����ϴ�.");
            System.out.print("�ٽ� �Է��ع�~ : ");
		}
		System.out.println("������ :" + point);
	}
}
}