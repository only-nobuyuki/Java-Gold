package problem1._3;

import java.util.Comparator;

//比較を行いたいクラスの外部クラスをつくり比較定義を行う。
//問題　関係するのは比較対象クラス（今回はItemクラス）のみなので公開範囲を限定する必要がある
public class PriceComparator implements Comparator<Item> {

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
