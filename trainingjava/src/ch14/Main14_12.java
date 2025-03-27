package ch14;

public class Main14_12 {

	public static void main(String[] args) {
		//　1人も勇者を生み出していない状況でも生み出せる（newせずとも静的フィールドは利用可能）
		Hero.money = 100;
		System.out.println(Hero.money);
		//箱がクラスに所属→クラス変数
	}

}
