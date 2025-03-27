package ch17;
//try-catchの後でcloseすると…（エラー)

import java.io.FileWriter;

public class Main17_4 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {//多態性(IOException | NullPointerException e)と変わらない
			System.out.println("何らかのエラーが発生しました。");
		}
		fw.close();
	}

}
