package OracleTutorial.Lesson003.DoWhileDemo;

/**
 * Created by Саманцов on 05.06.2015.
 */
public class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        do{
            System.out.println("Count is: " + count);
            count++;
        } while(count < 11);
    }
}
