package Wrapper_Class_Methods;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		// parseXxx(String s) → Converts String into primitive
		int a1 = Integer.parseInt("100");
		System.out.println("parseInt: " + a1);

		// valueOf(String s) → Converts String into wrapper object
		Integer a2 = Integer.valueOf("100");
		System.out.println("valueOf(String): " + a2);

		// valueOf(primitive) → Converts primitive into wrapper object
		Integer a3 = Integer.valueOf(10);
		System.out.println("valueOf(primitive): " + a3);

		// xxxValue() → Converts wrapper object into primitive
		int a4 = a3.intValue();
		System.out.println("intValue: " + a4);

		// toString() → Converts wrapper object into String
		String s1 = Integer.toString(10);
		System.out.println("toString: " + s1);

		// compareTo(Xxx obj) → Compares two wrapper objects
		Integer b1 = 20;
		System.out.println("compareTo: " + a3.compareTo(b1)); // -1 since 10 < 20

		// equals(Object obj) → Compares values, not references
		System.out.println("equals: " + a3.equals(Integer.valueOf(10))); // true

		// hashCode() → Returns hash code of object
		System.out.println("hashCode: " + a3.hashCode());

		// min(x, y) → Returns minimum of two values
		System.out.println("min: " + Integer.min(10, 20));

		// max(x, y) → Returns maximum of two values
		System.out.println("max: " + Integer.max(10, 20));

		// sum(x, y) → Returns sum of two values
		System.out.println("sum: " + Integer.sum(10, 20));

		// compare(x, y) → Compares two primitive values
		System.out.println("compare: " + Integer.compare(10, 20)); // -1

		// isNaN() → Checks if value is Not a Number (Double/Float only)
		double val1 = 0.0 / 0.0; // NaN
		System.out.println("isNaN: " + Double.isNaN(val1));

		// isInfinite() → Checks if value is infinite (Double/Float only)
		double val2 = 10.0 / 0.0; // Infinity
		System.out.println("isInfinite: " + Double.isInfinite(val2));

		// decode(String s) → Decodes decimal, hex, or octal string
		Integer hexVal = Integer.decode("0xA"); // 10 in decimal
		System.out.println("decode: " + hexVal);

		// parseBoolean(String s) → Converts String to boolean
		boolean boolVal = Boolean.parseBoolean("true");
		System.out.println("parseBoolean: " + boolVal);
	}
}
