package problem1.historyOfEnum;

public class Main {

	public static void main(String[] args) {

	}

	//定数をインターフェースに定義して使用
	void oldCoding() {
		int number = 0;
		switch (number) {
		case OldFruits.APPLE:
			System.out.println("apple");
			break;
		case OldFruits.ORANGE:
			System.out.println("orange");
			break;
		case OldFruits.BANANA:
			System.out.println("banana");
			break;
		}
	}

	//今は指摘してくれるがコンパイルエラーとかではないので
	//以下のメソッドなりたっていしまう
	void test() {
		if (OldFruits.APPLE == OldFruits.MELON) {
			System.out.println("ok");
		}
	}

	//Enumを使用する
	void newCoding() {
		NewFruits type = NewFruits.APPLE;
		switch (type) {
		case APPLE:
			System.out.println("apple");
			break;
		case ORANGE:
			System.out.println("orange");
			break;
		case BANANA:
			System.out.println("banana");
			break;
		default:
			break;
		}
	}
}
