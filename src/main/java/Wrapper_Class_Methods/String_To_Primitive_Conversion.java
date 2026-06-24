package Wrapper_Class_Methods;
public class String_To_Primitive_Conversion {
    public static void main(String[] args) {
    	
    	// ===== String → Primitive =====
    	
        // String → byte
        String strByte = "100";
        byte parsedByte = Byte.parseByte(strByte);
        System.out.println("String to byte: " + parsedByte);

        // String → short
        String strShort = "200";
        short parsedShort = Short.parseShort(strShort);
        System.out.println("String to short: " + parsedShort);

        // String → int
        String strInt = "300";
        int parsedInt = Integer.parseInt(strInt);
        System.out.println("String to int: " + parsedInt);

        // String → long
        String strLong = "400";
        long parsedLong = Long.parseLong(strLong);
        System.out.println("String to long: " + parsedLong);

        // String → float
        String strFloat = "50.55";
        float parsedFloat = Float.parseFloat(strFloat);
        System.out.println("String to float: " + parsedFloat);

        // String → double
        String strDouble = "60.66";
        double parsedDouble = Double.parseDouble(strDouble);
        System.out.println("String to double: " + parsedDouble);

        // String → char
        String strChar = "Z";
        char parsedChar = strChar.charAt(0); // no parseChar method
        System.out.println("String to char: " + parsedChar);

        // String → boolean
        String strBool = "true";
        boolean parsedBool = Boolean.parseBoolean(strBool);
        System.out.println("String to boolean: " + parsedBool);
    }
}
