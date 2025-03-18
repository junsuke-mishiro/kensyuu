package ch4;

//練習問題4-4
public class Main4Renshu4_4 {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		System.out.print("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int value : numbers) {
			if (input == value) {
				System.out.println("アタリ!");
			}
		}
	}

}
