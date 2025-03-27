package ch17;

import java.io.FileWriter;

public class Main17_3 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
			fw.close();
		} catch (Exception e) {//多態性(IOException | NullPointerException e)と変わらない
			System.out.println("何らかのエラーが発生しました。");
		}

	}

}
