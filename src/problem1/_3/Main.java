package problem1._3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import problem1._3.Item.InnerPriceComparator;

public class Main {

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item[] {
						new Item("egg", 100),
						new Item("jinjar", 84),
						new Item("ginga", 839)
				});

		//ItemクラスのcompareToメソッドを使用
		Collections.sort(items);
		for (Item item : items) {
			System.out.println(item.getName());
		}

		//PriceComparatorクラスのcompareToメソッドを使用
		Collections.sort(items, new PriceComparator());
		for (Item item : items) {
			System.out.println(item.getName());
		}

		//インナークラスの生成には縁クロージングクラスのインスタンスが必要だが
		//今、必要なのはPriceComparatorのインスタンスなのでコンストラクタを経由させたくない
		//Collections.sort(items, new Item());

		//static修飾することでえんくろーじんぐくらすのインスタンスを必要としない
		Collections.sort(items, new InnerPriceComparator());
		for (Item item : items) {
			System.out.println(item.getName());
		}
	}
}
