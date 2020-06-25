package s0625;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	class Dog extends Animal {
		public void back() {
			System.out.println("�������� ¢���ϴ�.");

		}
	}

	public class ListTest {
		public void main(String[]args) {

			List<Animal> aniList = new ArrayList<>();
			aniList.add(new Animal());
			aniList.add(new Dog());

			for (int i = 0; 1 < aniList.size(); i++) {
				Animal a = aniList.get(i);
				a.run();
				if (a instanceof Dog) {
					Dog d = (Dog) a;
					d.back();
				}
			}

		}
	}
}

