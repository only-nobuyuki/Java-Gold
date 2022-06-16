package problem1._1;

public class Outer {

	//インナークラス及びスタティックインナークラスはトップレベルクラスにメンバ

	static class StaticInner {
		public void test() {
			System.out.println("スタティックインナークラスですよ");
		}
	}

	class Inner {
		public void test() {
			System.out.println("インナークラスですよ");
		}
	}

	//ローカルクラス及び匿名クラスはメソッドで使用される一時的なクラス
	//メソッド内でのみ使用されるクラスなので他クラスからアクセスすることはできない
	//そのためアクセス修飾子はつかない
	public static void localClassMthod() {
		class Local {
			void test() {
				System.out.println("ローカルクラスですよ");
			}
		}
		new Local().test();
	}

	public static void main(String[] args) {
		StaticInner s = new StaticInner();
		s.test();

		Inner inner = new Outer().new Inner();
		inner.test();

		localClassMthod();
	}

}
