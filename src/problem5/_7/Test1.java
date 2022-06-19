package problem5._7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void run() throws IOException {
		String local = "C:\\pleiades\\sample\\";

		// 画像読み込み
		FileInputStream in = new FileInputStream(local + "samplepicture.jpg");
		BufferedInputStream bis = new BufferedInputStream(in);

		//画像書き出し
		FileOutputStream out = new FileOutputStream("samplepicture_bk.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(out);

		try (bis; bos) {
			byte[] data = null;
			while ((data = bis.readNBytes(1024)).length != 0) {
				bos.write(data);
			}
			bos.flush();
		}

		//音声読み込み
		FileInputStream inM = new FileInputStream(local +"music.mp3");
		BufferedInputStream bisM = new BufferedInputStream(inM);

		//音声書き出し
		FileOutputStream outM = new FileOutputStream("music_bk.mp3");
		BufferedOutputStream bosM = new BufferedOutputStream(outM);

		try (bisM; bosM) {
			byte[] data = null;
			//大きいファイルほどメモリの容量によって一度に取得するサイズと回数を考える
			while ((data = bisM.readNBytes(1024)).length != 0) {
				bosM.write(data);
			}
			bosM.flush();
		}

	}
}
