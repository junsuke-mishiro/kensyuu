package ch3;

//トイレの空きを待つ繰り返し処理
public class Main3_2 {

	public static void main(String[] args) {
		boolean doorClose = true; //ここでtrueかfalseを代入
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}

	}

}
