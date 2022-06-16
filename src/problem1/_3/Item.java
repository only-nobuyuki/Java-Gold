package problem1._3;

import java.util.Comparator;

//オブジェクトの比較する場合、基準にしたいメンバがひとつの場合は
//Comparableインターフェースを使用して実現する
//比較基準を複数設定したい場合困る
public class Item implements Comparable<Item> {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	//ひとつしか定義できないのでデフォルトの比較基準設定に使用できる
	@Override
	public int compareTo(Item target) {
		return name.compareTo(target.name);
	}

	//インナークラスを呼び出す際にエンクロージんぐクラスのコンストラクタを経由させずに
	//直接呼び出したいために
	public static class InnerPriceComparator implements Comparator<Item> {

		@Override
		public int compare(Item a, Item b) {
			if (a.getPrice() > b.getPrice()) {
				return -1;
			}
			if (a.getPrice() < b.getPrice()) {
				return 1;
			}
			return 0;
		}

	}

}
