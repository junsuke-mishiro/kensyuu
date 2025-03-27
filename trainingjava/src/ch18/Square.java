package ch18;

/**
 * 1つの位置座標と幅を指定することで、正方形を描画するクラス
 * 　　　　・正方形描画メソッド
 */

public class Square extends Rectangle {

	/**
	 * 引数は以下の通りとする。
	 * 　第1引数...Point型データのx座標
	 * 　第2引数...Point型データのy座標
	 * 　第3引数...正方形の一辺の長さ
	 * 　第4引数...正方形の一辺の長さ
	 * @param x
	 * @param y
	 * @param width
	 */

	public Square(int x, int y, int width) {
		super(x, y, width, width);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * 以下のようなメッセージを表示する。
	 * 出力例：
	 * 　"[正方形を描画] 点(0,0)を基準として幅・高さ200の正方形"
	 */

	public void draw() {
		System.out.println("［正方形を描画］点(" + this.p + ")を基準として幅・高さ" + this.width + "の長方形");
	}

}
