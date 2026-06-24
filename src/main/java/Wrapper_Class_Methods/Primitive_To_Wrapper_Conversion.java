package Wrapper_Class_Methods;
public class Primitive_To_Wrapper_Conversion {
    public static void main(String[] args) {
    	
    	// ===== Primitive → Wrapper and back =====
    	
        // byte ↔ Byte
        byte b = 10;
        Byte byteObj = Byte.valueOf(b);
        System.out.println("Byte object: " + byteObj);
        System.out.println("Back to primitive: " + byteObj.byteValue());

        // short ↔ Short
        short s = 20;
        Short shortObj = Short.valueOf(s);
        System.out.println("Short object: " + shortObj);
        System.out.println("Back to primitive: " + shortObj.shortValue());

        // int ↔ Integer
        int i = 30;
        Integer intObj = Integer.valueOf(i);
        System.out.println("Integer object: " + intObj);
        System.out.println("Back to primitive: " + intObj.intValue());

        // long ↔ Long
        long l = 40L;
        Long longObj = Long.valueOf(l);
        System.out.println("Long object: " + longObj);
        System.out.println("Back to primitive: " + longObj.longValue());

        // float ↔ Float
        float f = 50.5f;
        Float floatObj = Float.valueOf(f);
        System.out.println("Float object: " + floatObj);
        System.out.println("Back to primitive: " + floatObj.floatValue());

        // double ↔ Double
        double d = 60.6;
        Double doubleObj = Double.valueOf(d);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Back to primitive: " + doubleObj.doubleValue());

        // char ↔ Character
        char c = 'A';
        Character charObj = Character.valueOf(c);
        System.out.println("Character object: " + charObj);
        System.out.println("Back to primitive: " + charObj.charValue());

        // boolean ↔ Boolean
        boolean bool = true;
        Boolean boolObj = Boolean.valueOf(bool);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Back to primitive: " + boolObj.booleanValue());
    }
}
