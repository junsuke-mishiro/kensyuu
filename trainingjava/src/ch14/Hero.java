package ch14;

public class Hero {
	String name;
	int hp;
	static int money;//静的フィールド（Heroクラスで１つの財布）

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

	public static void setRandomMoney() {//staticをつけたメソッド
		Hero.money = (int) (Math.random() * 1000);
	}
}
