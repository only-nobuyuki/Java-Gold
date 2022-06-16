package problem1._11;

public class B implements AA {

	@Override
	public void test() {
		//インターフェースで定義されたdefaultメソッドは呼び出すことが出来る。
		//直接関係のあるインターフェースが継承しているインターフェース
		AA.super.test();
	}

	@Override
	public void sample() {
		//インターフェースで定義されたdefaultメソッドは呼び出すことが出来る。
		//直接関係のあるインターフェース
		AA.super.sample();
	}
}
