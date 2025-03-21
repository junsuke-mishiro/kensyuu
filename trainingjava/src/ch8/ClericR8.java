package ch8;

public class ClericR8 {
	String name;
	int hp = 50;
	final int MaxHp = 50;
	int mp = 10;
	final int MaxMp = 10;

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
