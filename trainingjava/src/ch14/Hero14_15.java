package ch14;

public class Hero14_15 {
	String name;
	int hp;
	static int money;

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
		System.out.printlln(this.name + "たちの所持金を初期化しました");/*静的メソッドの中では静的メンバしか利用できない／
		インスタンスがない状況でも動くのだから、thisがどのインスタンスかわからないことから、明らか*/
	}
}
