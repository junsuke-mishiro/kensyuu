package ch10;

public class SuperHero10_8 extends Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println(this.name + "飛び上がった！");
	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println(this.name + "着地した！");
	}

	//子クラスに再定義
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	//attack()をオーバーライドしたSuperHero
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
		if (this.flying) {
			System.out.println(this.name + "の攻撃");
		}
	}
}
