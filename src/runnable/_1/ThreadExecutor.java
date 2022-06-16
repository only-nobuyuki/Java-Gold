package runnable._1;

public class ThreadExecutor {

	public static void main(String[] args) {
		RunnableSample run = new RunnableSample();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		t1.start();
		t2.start();
		t3.start();
	}

}
