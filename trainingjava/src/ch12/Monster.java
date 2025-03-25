package ch12;

public abstract class Monster {
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("モンスターは逃げ出した。");

	}
}
