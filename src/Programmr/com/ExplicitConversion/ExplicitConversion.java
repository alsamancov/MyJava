package Programmr.com.ExplicitConversion;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * The below example demonstrates how to do explicit conversion
 * of data-types in java. The example below converts data-type
 * of Double (variable d) to data-type of Float (variable f),
 * converts data-type of Int (variable n) to data-type of Short
 * (variable s), converts data-type of Long (variable m) to
 * data-type of Byte (variable b).
 */
public class ExplicitConversion {
    public static void main(String[] args){
        double d = 2.3e-300D;
        float f = (float) d;
        int n = 365128;
        short s = (short) 365128;
        long m = 34;
        byte b = (byte) m;
        System.out.println("d is " + d);
        System.out.println("f is " + f);
        System.out.println("n is " + n);
        System.out.println("s is " + s);
        System.out.println("m is " + m);
        System.out.println("b is " + b);
    }
}
