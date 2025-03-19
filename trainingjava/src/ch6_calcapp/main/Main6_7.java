package ch6_calcapp.main;

public class Main6_7 {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = ch6_calcapp.logics.CalcLogic6_6.tasu(a, b);
		int delta = ch6_calcapp.logics.CalcLogic6_6.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);

	}

}