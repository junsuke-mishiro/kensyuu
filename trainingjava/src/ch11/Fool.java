package ch11;

public class Fool extends Character implements Human{
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	public void attack(matanago m) {
		System.out.println(this.name + "戦わず遊んでいる");
	}
	//さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {
	}
	public void watch(){
		
	}
	public void hear() {
	}
	public void run() {
	}

}
