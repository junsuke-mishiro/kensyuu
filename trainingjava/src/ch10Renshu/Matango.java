package ch10Renshu;

public class Matango {
	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
