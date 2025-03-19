package ch6_calcapp.main;

//全クラスをインポートする
import ch6_calcapp.logics.CalcLogic6_6;

public class Main6_9 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic6_6.tasu(a, b);
		int delta = CalcLogic6_6.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);

	}

}