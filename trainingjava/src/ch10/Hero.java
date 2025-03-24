package ch10;

public class Hero {
	String name = "ミナト";
	int hp = 100;

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	//slip()はオーバーライドできないHeroクラス
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("５のダメージ");
	}

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}

}
