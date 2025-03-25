package ch13;

public class Hero {
	private int hp;//hpフィールドをHeroクラスのみ
	private String name;
	Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	private void die() {//プライベートメソッドに
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GEME OVERです。");
	}

	void sleep() {//同パッケージのみprivate package
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}

	public void attack(Matango m) {//全てのクラス可
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	public String getName() {//talk()用
		return this.name;
	}
}
