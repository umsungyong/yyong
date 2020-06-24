package s0624;

import java.util.ArrayList;

import java.util.List;

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + "], [age=" + age;
	}

}

public class ListTest3 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
        
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());
         Person p = pList.get(1);
         p.setName("아아");
         p.setAge(25);
		System.out.println(p);

		/*pList.get(1).setName("아아");
		 * pList.get(1).setAge(25);
		 * System.out.println(pList.get(1)); 
		 */
	}

}
