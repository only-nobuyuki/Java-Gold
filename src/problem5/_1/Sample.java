package problem5._1;

import java.io.File;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");

		File folder = new File("test");
		if (file.exists() == false) {
			String uri = folder.getAbsolutePath() + "\\" + file.getName();
			folder.mkdir();
			file = new File(uri);
			file.createNewFile();
		}
		System.out.println(file.getAbsolutePath());
	}

}
