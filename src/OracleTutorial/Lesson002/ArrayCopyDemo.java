package OracleTutorial.Lesson002;

/**
 * Created by Саманцов on 31.05.2015.
 */
public class ArrayCopyDemo {
    public static void main(String[] args){
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
