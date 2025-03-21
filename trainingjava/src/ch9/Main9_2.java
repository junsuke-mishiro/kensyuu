package ch9;

public class Main9_2 {

	public static void main(String[] args) {
		Hero9_3 h1;
		h1 = new Hero9_3();
		h1.hp =100;
		Hero9_3 h2;
		h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);
	}

}

