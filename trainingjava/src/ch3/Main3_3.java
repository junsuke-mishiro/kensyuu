package ch3;

//波カッコを省略した記述
public class Main3_3 {

	public static void main(String[] args) {
		boolean tenki = true; //ここでT/F代入
		if (tenki == true) { //波かっこ省略不可
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else //波かっこ省略（非推奨）
			System.out.println("DVDを見ます");

	}

}