package ch17;

import java.io.FileWriter;

public class Main17_6 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかのエラーが発生しました。");
		} finally {
			fw.close();
		}

	}

}
