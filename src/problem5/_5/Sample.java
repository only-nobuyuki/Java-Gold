package problem5._5;

import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		//上書きモード
		FileWriter overwrite = new FileWriter("output.txt");
		//追記モード
		FileWriter postscript = new FileWriter("output.txt", true);
		try (overwrite) {
			overwrite.write("hello");
		}

	}

}
