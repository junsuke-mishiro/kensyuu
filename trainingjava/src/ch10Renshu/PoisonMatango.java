package ch10Renshu;

public class PoisonMatango extends Matango {
	int poisonCt = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (poisonCt > 0) {
			int poisonDamage = h.hp / 5;//doubleにしてしまっていたがintにする
			System.out.println("さらに毒の胞子をばらまいた！");
			h.hp -= poisonDamage;
			System.out.println(poisonDamage + "ポイントのダメージ！");
			this.poisonCt--;//！thisが不足
		}
	}

}
