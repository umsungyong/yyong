package s0624;

import java.util.ArrayList;

import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("가가가");
		strList.add("아하하");
		strList.add("우우우");
		int idx = strList.indexOf("아 하하");
		System.out.println(idx);

	}
}
