package problem1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String target = "私は100点";
		Pattern halfwidthAlphabet = Pattern.compile("[a-zA-Z_0-9]+");
		Matcher m = halfwidthAlphabet.matcher(target);
		m.find();
		System.out.println(m.group());

		System.out.println("始点は" + m.start() + "終点は" + m.end() + "結果は" + m.group());
	}

}
