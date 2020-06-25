package s0625;

import java.util.ArrayList;
import java.util.List;

public class MinNum {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(400);
		numList.add(200);
		numList.add(1000);
		numList.add(700);
		numList.add(500);

		int min = 0;
		for (int i = 0; i < numList.size(); i++) {
			if (i == 0 || min > numList.get(i)) {
				min = numList.get(i);
			}
		}
		System.out.println("Á© ³·Àº Á¡¼ö : " + min);

	}

}
