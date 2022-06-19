package problem5._4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("test.txt");
		//バッファへのアクセスで効率的にデータを読むことtに特化
		BufferedReader reader = new BufferedReader(fr);
		String line = null;
		try (reader) {
			line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		//未記入の個所はnullが返る
		line = reader.readLine();
		System.out.println(line);

		//Sream API使うとこうなる
		//		try (reader) {
		//			reader.lines().forEach(System.out::println);
		//		}

	}

}
