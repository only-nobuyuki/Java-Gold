package problem1._11;

public interface AA extends A {
	default void sample() {
		System.out.println("AA");
	}
}
