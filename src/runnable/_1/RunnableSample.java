package runnable._1;

public class RunnableSample implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("スレッド" + name + "動いてるよ");

	}

}
