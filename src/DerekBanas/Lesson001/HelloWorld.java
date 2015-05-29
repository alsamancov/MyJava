package DerekBanas.Lesson001;

/**
 * Created by Саманцов on 29.05.2015.
 */
public class HelloWorld {
    static String randomString = "String to print";
    static final double PINUM = 3.141529;
    public static void main(String[] args){
        System.out.println(PINUM);
        int integerOne = 22;

        int integerTwo = integerOne + 1;

        byte bigByte = 127;
        short bigShort = 32767;

        int bigInt = 21000000;

        long bigLong = 92000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.141529098430982;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';

        System.out.println(randomChar);
        System.out.println(anotherChar);

        String randomString = "I'm a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + " " + anotherString;

        System.out.println(andAnotherString);

        String byteString = Byte.toString(bigByte);

        System.out.println(byteString);
    }
}
