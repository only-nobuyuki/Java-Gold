package problem5._7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	String local = "C:\\pleiades\\sample\\";
	String fileName = "movie.mp4";

	public BufferedStream run() throws IOException {
		BufferedStream bf = new BufferedStream();

		FileInputStream in = new FileInputStream(local + fileName);
		BufferedInputStream bis = new BufferedInputStream(in);
		bf.setIn(bis);

		FileOutputStream out = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(out);
		bf.setOut(bos);

		return bf;

	}

	public void excute(BufferedStream bf) throws IOException {
	}

	public void result() {
		File file = new File(local + fileName);
		if (file.exists() == true) {
			System.out.println("成功");
		} else {
			System.out.println("失敗");
		}
	}

}
