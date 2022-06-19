package problem5._7;

import java.io.IOException;

public class ExecutionTimeMeasurement {

	public static void excute() throws IOException {

		Test test = new Test5();
		BufferedStream bf = test.run();

		// 処理前の時刻を取得
		long startTime = System.currentTimeMillis();

		// 時間計測をしたい処理

		test.excute(bf);

		// 処理後の時刻を取得
		long endTime = System.currentTimeMillis();

		System.out.println("開始時刻：" + startTime + " ms");
		System.out.println("終了時刻：" + endTime + " ms");
		System.out.println("処理時間：" + (endTime - startTime) + " ms");

		test.result();
	}
}
