package problem5._7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class Test2 extends Test {

	@Override
	public void excute(BufferedStream bf) throws IOException {
		BufferedInputStream in = bf.getIn();
		BufferedOutputStream out = bf.getOut();
		try (in; out) {
			byte[] data = null;
			data = in.readAllBytes();
			out.write(data);

			out.flush();
		}
	}
}