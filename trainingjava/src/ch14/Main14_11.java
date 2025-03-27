package ch14;

public class Main14_11 {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);//instance名.静的フィールド名でも表示　100表示
		h1.money = 300;//h1.moneyに300を代入すると
		System.out.println(h2.money);//h2.moneyにも300が表示（among instanceで共有）
	}
}