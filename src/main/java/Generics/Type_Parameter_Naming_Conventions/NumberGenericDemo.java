package Generics.Type_Parameter_Naming_Conventions;
class Calculator<N extends Number> {
    private N num1;
    private N num2;

    public Calculator(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }
}

public class NumberGenericDemo {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(10, 20);
        System.out.println("Integer Add: " + intCalc.add());       // 30.0
        System.out.println("Integer Multiply: " + intCalc.multiply()); // 200.0

        Calculator<Double> doubleCalc = new Calculator<>(5.5, 2.0);
        System.out.println("Double Add: " + doubleCalc.add());     // 7.5
        System.out.println("Double Multiply: " + doubleCalc.multiply()); // 11.0
    }
}
