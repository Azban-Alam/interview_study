package String_Methods;

public class Imp_Method_ToString {
	public static void main(String[] args) {
		String text = "Hello World";

		String result = text.toString();
		System.out.println(result); // Output: Hello World

		Integer num = 100;
		System.out.println(num.toString()); // Output: 100

		Double d = 45.67;
		System.out.println(d.toString()); // Output: 45.67

	}
}

class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [Name = " + name + " and ID =" + id + "]";
	}
}

class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Israr", 101);
		System.out.println(emp.toString()); // Output: Employee [Name = Israr and ID =101]

	}
}
