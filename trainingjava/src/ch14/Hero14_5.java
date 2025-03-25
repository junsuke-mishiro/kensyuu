package ch14;

public class Hero14_5 {
	String name;
	int hp;

	public String toString() {//意図する文字列表現を返すtoString()を定義（オーバーライド）
		return "名前：" + this.name + "／HP：" + this.hp;
	}

}
