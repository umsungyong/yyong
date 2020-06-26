package s0624;

import java.util.ArrayList;

import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		p.setName("가나다라");
		p = new Person();
		System.out.println(pList.get(0));
	}
}
/*
 * Person p1 = new person(); 
 * p1.setName("우뢰매"); 
 * p1.setAge(10);
 * 
 * Person p2= p1; 
 * p1 = new Person(); 
 * p1.setName("에반게리온");
=======
		p.setName("�����ٶ�");
		p = new Person();
		System.out.println(pList.get(0));
	}
}
/*
 * Person p1 = new person(); 
 * p1.setName("��ڸ�"); 
 * p1.setAge(10);
 * 
 * Person p2= p1; 
 * p1 = new Person(); 
 * p1.setName("���ݰԸ���");
>>>>>>> branch 'master' of https://github.com/umsungyong/yyong.git
 * System.out.println(p2.getName()); 
 * System.out.println(p2.getAge());
 * 
 * 
 * 
 * 
 */
