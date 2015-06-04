package OracleTutorial.Lesson003;

/**
 * Created by Саманцов on 03.06.2015.
 */
public class BlockDemo {
    public static void main(String[] args){
        boolean condition = true;

        if(condition){ //begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { //begin block 2
            System.out.println("Condition is false.");
        } // end block 2
    }
}
