package problem5._2;

import java.io.File;

public class Sample {
	public static void main(String[] arg) {
		File rootDir = new File(".");
		showTree(rootDir, "");

	}

	//再帰処理は慣れずらい
	public static void showTree(File dir, String indent) {
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(indent + file.getName());
			if (file.isDirectory()) {
				showTree(file, indent + " ");
			}
		}
	}
}
