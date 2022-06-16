package problem1._6;


//ローカルクラスの特徴
//メソッドごとにクラス実装内容を変更できること
public class Factry {
	public static Test hello() {
		class Hello implements Test {
			@Override
			public void execute() {
				System.out.println("hello.");
			}
		}
		return new Hello();
	}

	public static Test bye() {
		class Bye implements Test {
			@Override
			public void execute() {
				System.out.println("bye");
			}
		}
		return new Bye();
	}
}
