package ch13;

public class King13_7 {
	void talk(Hero h) {
		System.out.println("王様：ようこそ我が国へ、勇者" + h.name + "よ。");//Heroクラス全体をprivateにするとここでエラー
		System.out.println("王様：長旅疲れたであろう。");
		System.out.println("王様：まずは城下町を見てくるとよい。ではまた会おう。");
		h.die();
	}

}
