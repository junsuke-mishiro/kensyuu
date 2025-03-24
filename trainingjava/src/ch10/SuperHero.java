package ch10;

public class SuperHero extends Hero {
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

	//親クラスのattack()を呼び出す
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}
}
