package s0625;

import java.util.ArrayList;
import java.util.List;

public class Point3 {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Student s = new Student();
			s.setName("ÀÌ¸§ "+ i);
			s.setPoint(i);
			stList.add(s);
		
		}
         System.out.println(stList);
	}
}
