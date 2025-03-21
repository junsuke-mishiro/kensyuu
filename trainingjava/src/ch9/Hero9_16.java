package ch9;
//別のコンストラクタを呼び出す
public class Hero9_16 {
	String name;
	int hp;
	Sword9_3 sword;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	public Hero9_16(String name) {//コンストラクタ①
		this.hp = 100;
		this.name = name;

	}

	public Hero9_16() {//コンストラクタ②
		this("ダミー");
	}

}
