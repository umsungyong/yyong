package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3 {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			Student s = new Student();
			s.setName("�̸� " + i);
			s.setPoint(r.nextInt(101));
			stList.add(s);

		}

		Student maxStudent = null;
		Student minStudernt = null;
		for (int i = 0; i < stList.size(); i++) {
         Student st = stList.get(i);
			if (i == 0 || minStudent.getPoint()>st.getPoint()) {
				 minStudnt
			}
			if ( i == 0 || maxStudent.getPoint()<st.getPoint()) {
				
			
			
		}
		System.out.println("1�� :" maxStudent);
		System.out.println("�õ�:" minStudent);
	}
}
	}
