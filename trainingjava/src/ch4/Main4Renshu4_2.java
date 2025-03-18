package ch4;

//練習問題4-2
public class Main4Renshu4_2 {

	public static void main(String[] args) {
		int[] moneyList = { 121902, 8302, 55100 };

		for (int i = 0; i < 3; i++) {
			System.out.println(moneyList[i]);
		}

		for (int value : moneyList) {
			System.out.println(value);
		}

	}

}
