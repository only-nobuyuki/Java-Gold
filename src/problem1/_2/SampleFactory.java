package problem1._2;

public class SampleFactory {
	public static Sample create() {
		return new SampleFactory().new SampleImpl();
	}

	//誰かがSampleImplクラスを予期しない使い方しないようにファクトリークラスの配下に
	//置くことで直接SampleImplクラスを呼べないようにする。
	//privarteにすることでSampleFactoryクラス経由でしか呼べないようにする。
	private class SampleImpl implements Sample {
		public void test() {
			System.out.println("test");
		}

		@Override
		public void execute() {
			System.out.println("execute");
		}
	}

}
