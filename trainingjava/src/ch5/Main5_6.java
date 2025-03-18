package ch5;

//引数を使わずに値を渡せないのか？（エラー）
public class Main5_6 {

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();

	}

	public static void add() {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
