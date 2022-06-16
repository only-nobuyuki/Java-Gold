package problem1._7.copy;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;

public class ThreadSample {
	public static void main(String[] args) {
		//使用用途
		//インターフェースの実現クラス
		//抽象クラスか具象クラスを継承したサブクラス
		//上のようなクラスを名前を持たないクラスとして実装内容のみを定義したもの
		//特定のメソッドのみでしか使用しない（他のメソッドと共有しない）場合は
		//ローカルクラスより匿名クラスの使用を推奨
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		};

		//ArrayListの一部メソッド（今回はaddメソッド）に実装に追加ができる
		List<String> list = new ArrayList<String>() {
			Logger logger = System.getLogger("sample");

			@Override
			public boolean add(String value) {
				System.out.println("アンパンマン" + value);
				return super.add(value);
			}
		};
		list.add("A");
		list.add("B");
		list.add("C");
	}
}
