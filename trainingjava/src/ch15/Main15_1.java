package ch15;

public class Main15_1 {

	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");//変数.lenth()は全角文字も半角文字も1文字としてカウント
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");//length() == 0 より直感的に意味をとらえやすい
		}
	}

}
