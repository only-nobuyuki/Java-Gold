package problem1._6;

public class IllegalAccessSample {
	public void test() {
		//ローカルクラスはクラスを定義したメソッドのローカル変数にアクセル可能
		String name = "sample";
		class Sample {
			public void hello() {
				System.out.println("hell" + name);
			}
		}
		//ローカルクラスで使用したローカル変数は実質的なfinalとなる。
		//ローカル変数ローカルクラスはライフサイクルに差がある
		//ローカル変数→変数を定義しているメソッドの処理が終了するとメモリから消える
		//ローカルクラスは参照が残っていればメモリ上に残る。
		//そのためローカルクラスのインスタンス生成時にローカル変数の値をコピーしたものを
		//インスタンスに渡す仕組みになっている。
		//だからローカルクラスの定義後にローカル変数を変更できてしまうと
		//元の値とコピーした値で齟齬が発生してしまうために変更が不可になっている。

		//以下の定義はコンパイルエラーになる
		//name = "test";
		new Sample().hello();
	}
}
