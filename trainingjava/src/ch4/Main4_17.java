package ch4;

//nullの利用（エラー）
public class Main4_17 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		array = null;
		array[0] = 10;
	}

}
