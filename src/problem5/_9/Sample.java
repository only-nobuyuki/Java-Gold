package problem5._9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {
	public static void main(String[] arg) throws IOException {
		List<PostalCode> list = createList("samp.csv");
		list.forEach(System.out::println);
	}

	private static List<PostalCode> createList(String file) throws FileNotFoundException {
		List<PostalCode> list = new ArrayList<PostalCode>();
		FileInputStream fis = new FileInputStream(file);

		Scanner scanner = new Scanner(fis);
		scanner.useDelimiter(",|\n");

		try (scanner) {
			while (scanner.hasNext()) {
				String code = scanner.next().replaceAll("\"", "");
				String prefectures = scanner.next().replaceAll("\"", "");
				String city = scanner.next().replaceAll("\"", "");
				String town = scanner.next().replaceAll("\"", "");
				String prefecturesByRomanAlphabet = scanner.next().replaceAll("\"", "");
				String cityByRomanAlphabet = scanner.next().replaceAll("\"", "");
				String townByRomanAlphabet = scanner.next().replaceAll("\"", "");
				list.add(new PostalCode(code, prefectures, city, town, prefecturesByRomanAlphabet, cityByRomanAlphabet,
						townByRomanAlphabet));
			}
		}
		return list;

	}
}