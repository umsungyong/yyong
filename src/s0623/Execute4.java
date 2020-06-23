package s0623;

public class Execute4 {
	public static void maina(String[] args) {
		Cat[] cats = new Cat[20];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[0].setName("°í¾çÀÌ" + i);
			cats[0].setAge(i);
		}

		  for(Cat cat:cats) {
	    	   System.out.println(cat);
	    	}
		
	}

}
