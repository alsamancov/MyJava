package OracleTutorial.Lesson002;

/**
 * Created by Саманцов on 31.05.2015.
 */
public class MultiDimArrayDemo {
    public static void main(String[] args){
        String[][] names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
    }
}
