package problem5._6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter out = new FileWriter("outputByBufferedWriter.txt");
		BufferedWriter writer = new BufferedWriter(out);
		try (writer) {
			writer.newLine();
			writer.write("buffering output");
			//バッファの内容を明示的に出力する
			//バッファの内容と作成したファイルの内容に差異を出さないようにする　
			writer.flush();
		}
		File file = new File("outputByBufferedWriter.txt");
		if (file.exists() == true) {
			System.out.println("fileが作成されました");
		} else {
			System.out.println("fileの作成に失敗しました");
		}
	}

}
