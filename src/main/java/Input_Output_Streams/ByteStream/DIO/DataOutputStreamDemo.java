package Input_Output_Streams.ByteStream.DIO;
// Java Program to Demonstrate DataOutputStream

// Importing required classes
import java.io.*;

// Main class
// DataOutputStreamDemo
class DataOutputStreamDemo {
        // Main driver method
        public static void main(String args[]) throws IOException {
                // Try block to check for exceptions
                // Writing the data using DataOutputStream
                try ( DataOutputStream dout =
                                                new DataOutputStream(new FileOutputStream("file.dat")) ) {
                        dout.writeDouble(1.1);
                        dout.writeInt(55);
                        dout.writeBoolean(true);
                        dout.writeChar('4');
                }

                catch (FileNotFoundException ex) {
                        System.out.println("Cannot Open the Output File");
                        return;
                }

                // Reading the data back using DataInputStream
                try ( DataInputStream din =
                                                new DataInputStream(new FileInputStream("file.dat")) ) {
                        double a = din.readDouble();
                        int b = din.readInt();

                        boolean c = din.readBoolean();
                        char d = din.readChar();

                        System.out.println("Values: " + a + " " + b + " " + c + " " + d);
                }

                // Catch block to handle FileNotFoundException
                catch (FileNotFoundException e) {
                        System.out.println("Cannot Open the Input File");
                        return;
                }
        }
}