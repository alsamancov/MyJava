package OracleTutorial.Lesson002;

/**
 * Created by Саманцов on 31.05.2015.
 */
public class ArrayCopyOfDemo {
    public static void main(String[] args){
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}
