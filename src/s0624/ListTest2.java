package s0624;

import java.util.ArrayList;

import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("������");
		strList.add("������");
		strList.add("����");
		int idx = strList.indexOf("�� ����");
		System.out.println(idx);

	}
}
