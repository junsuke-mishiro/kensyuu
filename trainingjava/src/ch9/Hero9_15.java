package ch9;

//別のコンストラクタを呼び出す（エラー）
public class Hero9_15 {
	String name;
	int hp;
	Sword9_3 sword;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	public Hero9_15(String name) {//コンストラクタ①
		this.hp = 100;
		this.name = name;
		
	}
	public Hero9_15() {//コンストラクタ②
		this.Hero9_15("ダミー");
	}

}
