package ch9;

public class Main9_6 {

	public static void main(String[] args) {
		Hero9_3 h1 = new Hero9_3();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero9_3 h2 = new Hero9_3();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}

}
