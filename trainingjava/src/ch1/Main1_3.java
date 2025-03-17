package ch1;

//変数の再代入
public class Main1_3 {

	public static void main(String[] args) {
		int age = 20; //変数ageを20で初期化
		System.out.println("私の年齢は" + age);
		age = 31; //変数ageに再代入している
		System.out.println("…いや、本当の年齢は" + age);
	}

}