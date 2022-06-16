package problem3._2;

public class Sample {
	Runnable a = new Runnable() {
		@Override
		public void run() {
			System.out.println("runnable");
		}
	};

	public void test() {
		Thread t = new Thread(a);
		t.start();

	}
}
