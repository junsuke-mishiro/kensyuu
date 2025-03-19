package ch5;

//練習問題5-4
public class Main5Renshu5_4 {
	public static double calcTriangleArea(double bottom, double height) {
		double tArea = bottom * height / 2;
		return tArea;
	}

	public static double calcCircleArea(double radius) {
		double cArea = radius * radius * 3.14;
		return cArea;
	}

	public static void main(String[] args) {
		double triArea = calcTriangleArea(10.0, 5.0);
		double cirArea = calcCircleArea(5.0);
		System.out.println("底辺10.0cm、高さ5.0cmの三角形の面積は" + triArea + "㎠です。");
		System.out.println("半径5.0cmの円の面積は、" + cirArea + "㎠です。");
	}

}
