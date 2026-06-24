package Wrapper_Class_Methods;
public class WrapperToStringConversion {
    public static void main(String[] args) {
    	
    	// ===== Wrapper → String =====
    	
        // Byte → String
        Byte byteObj = Byte.valueOf((byte) 10);
        String byteStr1 = byteObj.toString();
        String byteStr2 = String.valueOf(byteObj);
        System.out.println("Byte to String: " + byteStr1 + " | " + byteStr2);

        // Short → String
        Short shortObj = Short.valueOf((short) 20);
        String shortStr1 = shortObj.toString();
        String shortStr2 = String.valueOf(shortObj);
        System.out.println("Short to String: " + shortStr1 + " | " + shortStr2);

        // Integer → String
        Integer intObj = Integer.valueOf(30);
        String intStr1 = intObj.toString();
        String intStr2 = String.valueOf(intObj);
        System.out.println("Integer to String: " + intStr1 + " | " + intStr2);

        // Long → String
        Long longObj = Long.valueOf(40L);
        String longStr1 = longObj.toString();
        String longStr2 = String.valueOf(longObj);
        System.out.println("Long to String: " + longStr1 + " | " + longStr2);

        // Float → String
        Float floatObj = Float.valueOf(50.5f);
        String floatStr1 = floatObj.toString();
        String floatStr2 = String.valueOf(floatObj);
        System.out.println("Float to String: " + floatStr1 + " | " + floatStr2);

        // Double → String
        Double doubleObj = Double.valueOf(60.6);
        String doubleStr1 = doubleObj.toString();
        String doubleStr2 = String.valueOf(doubleObj);
        System.out.println("Double to String: " + doubleStr1 + " | " + doubleStr2);

        // Character → String
        Character charObj = Character.valueOf('A');
        String charStr1 = charObj.toString();
        String charStr2 = String.valueOf(charObj);
        System.out.println("Character to String: " + charStr1 + " | " + charStr2);

        // Boolean → String
        Boolean boolObj = Boolean.valueOf(true);
        String boolStr1 = boolObj.toString();
        String boolStr2 = String.valueOf(boolObj);
        System.out.println("Boolean to String: " + boolStr1 + " | " + boolStr2);
    }
}
