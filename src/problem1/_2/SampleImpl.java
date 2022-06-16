package problem1._2;

//実現クラスはこのままだと同じパッケージならどこからでも利用することが出来て
//なおかつ見せたくないtestメソッドが予期しない形で利用される可能性があるので対応が必要
public class SampleImpl implements Sample {
	public void test() {
		System.out.println("test");
	}

	@Override
	public void execute() {
		System.out.println("execute");
	}
}
