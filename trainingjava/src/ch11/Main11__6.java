package ch11;

public class Main11__6 {
	public static void main(String[] args) {
		Character c  = new Hero();//Character c = new Character();→継承の材料をnewして利用されてしまう
		Matango m = new Matango();
		c.attack(m);
	}
}
