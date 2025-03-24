package ch9;

//練習問題9_2
public class MainR9 {

	public static void heal(int hp) {
		hp += 10;

	}

	public static void heal(ThiefR9 thief) {
		thief.hp += 10;

	}

	public static void main(String[] args) {
		int baseHp = 25;
		ThiefR9 t = new ThiefR9("アサカ", baseHp);
		System.out.println(baseHp + " : " + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + " : " + t.hp);

	}

}
