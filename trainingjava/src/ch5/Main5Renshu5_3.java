package ch5;

public class Main5Renshu5_3 {

	public static void email(String title, String adress, String text) {
		System.out.println(adress + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文" + text);
	}

	public static void email(String adress, String text) {
		System.out.println(adress + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文" + text);
	}

	public static void main(String[] args) {
		String adress = "asdfjkl;@;lkjfdsa";
		String text = "今度○○くんとキャンプに行くことになりました。ご一緒しませんか。";
		email(adress, text);
	}

}