package s0617;

public class Constructor {
	/*
	 * 1.생산자는 데이터타입이 없다. 2.클래스명과 대소문자까지 똑같다
	 */
    Constructor(){
    	System.out.println("아아 아아");
    }
	
	public static void main(String[] args) {
		Constructor c= new Constructor();
		System.out.println(c);

	}

}
