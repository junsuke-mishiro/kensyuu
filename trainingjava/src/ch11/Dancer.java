package ch11;

public class Dancer extends Character {
	public void cance() {
		System.out.println(this.name + "は情熱的に踊った");


	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;

	}
}
