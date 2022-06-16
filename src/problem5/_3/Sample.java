package problem5._3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileReader reader = new FileReader("test.txt");
		try (reader) {
			int i = 0;
			while ((i = reader.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
			}
		}
	}
}
