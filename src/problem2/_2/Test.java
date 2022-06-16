package problem2._2;

import java.util.function.Supplier;

public class Test {
	public void execute() {
		System.out.println("事前処理");
		A a = Factry.create();
		a.hello();
		System.out.println("事後処理");
	}

	public void execute(Supplier<A> supplier) {
		System.out.println("事前処理");
		A a = supplier.get();
		a.hello();
		System.out.println("事後処理");
	}
}
