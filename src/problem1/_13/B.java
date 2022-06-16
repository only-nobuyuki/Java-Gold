package problem1._13;

public abstract class B implements A {
	//	public void test() {
	//		System.out.println("B");
	//	}

	//リスコフの置換原則により
	//サブクラスはスーパークラスに置き換え可能でなければならない。
	//つまりメソッドをオーバーライドするときはアクセス修飾子を厳しくすることはできない。
	//	protected void test() {
	//
	//	}
}
