package Generics.Generic_Class;

// We can also pass multiple Type parameters in Generic classes. 

class Test1<T, U> {
	T obj1; // An object of type T
	U obj2; // An object of type U

	Test1(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

class Geeks1 {
	public static void main(String[] args) {
		Test1<String, Integer> obj = new Test1<String, Integer>("GfG", 15);

		obj.print();
	}
}