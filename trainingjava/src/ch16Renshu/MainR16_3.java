package ch16Renshu;

import java.util.HashMap;
import java.util.Map;

class Hero {
	private String name;

	public Hero(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class MainR16_3 {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for (Hero key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}

		/*int saito = prefs.get("斎藤");                   for文無しだった／getNameがある意図が読めてなかった
		System.out.println("斎藤が倒した敵＝" + saito);
		int suzuki = prefs.get("鈴木");
		System.out.println("斎藤が倒した敵＝" + suzuki);*/

	}

}
