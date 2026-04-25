package Generics.Bounded_Types;

/*You can also combine class + interface bounds:*/

class Data<T extends Number & Comparable<T>> {
	private T value;

	public Data(T value) {
		this.value = value;
	}

	public boolean isGreater(T other) {
		return value.compareTo(other) > 0;
	}
}

public class Multiple_Bounds {
	public static void main(String[] args) {
		Data<Integer> d1 = new Data<>(10);
		System.out.println(d1.isGreater(5)); // true

		Data<Double> d2 = new Data<>(3.5);
		System.out.println(d2.isGreater(4.0)); // false
	}
}
