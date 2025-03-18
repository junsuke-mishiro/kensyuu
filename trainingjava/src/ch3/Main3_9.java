package ch3;

//for文のループを２重にして九九の表を出力する
public class Main3_9 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);//掛け算結果入力
				System.out.print(" ");//空白入力				
			}
			System.out.println("");//改行入力
		}

	}

}
