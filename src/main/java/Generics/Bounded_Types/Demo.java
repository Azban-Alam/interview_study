package Generics.Bounded_Types;

/*
 * What Are Bounded Types?
 * Bounded types let you restrict the kinds of arguments that can be passed to a type parameter.
 * Syntax : <T extends SomeClass>
 */
class Printer<T extends Number> {
	public void printDouble(T value) {
		System.out.println(value.doubleValue());
	}
}

public class Demo {
	public static void main(String[] args) {
		Printer<Integer> intPrinter = new Printer<>();
		intPrinter.printDouble(10); // prints 10.0

		Printer<Double> doublePrinter = new Printer<>();
		doublePrinter.printDouble(5.5); // prints 5.5

		// Printer<String> strPrinter = new Printer<>(); ❌ Compile error
		// Only Number and its subclasses (Integer, Double, Float, etc.) are allowed.
	}
}
