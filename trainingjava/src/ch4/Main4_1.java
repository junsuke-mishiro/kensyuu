package ch4;

//点数管理プログラム
public class Main4_1 {

	public static void main(String[] args) {
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int shakai = 80;

		int sum = sansu + kokugo + rika + eigo + shakai;

		int avg = sum / 5;
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

	}

}
