package problem1.historyOfEnum;

//enum導入前には定数をインたーフェースに定義して使用されていた
public interface OldFruits {
	public final static int APPLE = 0;
	public final static int ORANGE = 1;
	public final static int BANANA = 2;
	//長いメンテナンスの歴史の中で値の重複が発生する。
	public final static int MELON = 0;
}
