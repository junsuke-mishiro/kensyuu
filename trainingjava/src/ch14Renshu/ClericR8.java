package ch14Renshu;

public class ClericR8 {
	String name;
	int hp = 50;
	static final int MaxHp = 50;//練習問題８に追加
	int mp = 10;
	static final int MaxMp = 10;//静的フィールドにして最大HPMPを各インスタンスに保持されない

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.hp = this.MaxHp;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}

	public int pray(int sec) {
		System.out.println(sec + "秒間" + this.name + "は祈った");

		int random = new java.util.Random().nextInt(3);
		this.mp = sec + random;
		if (this.mp > MaxMp) {
			this.mp = MaxMp;
		}
		System.out.println("MPが" + this.mp + "に回復した");

	}

}
