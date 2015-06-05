package OracleTutorial.Lesson003.BreakDemo;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * The break statement has two forms: labeled and unlabeled.
 * You saw the unlabeled form in the previous discussion of
 * the switch statement. You can also use an unlabeled break
 * to terminate a for, while, or do-while loop, as shown in
 * the following BreakDemo program:
 */
public class BreakDemo {
    public static void main(String[] args){
        int[] arrayOfInts = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for(i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] == searchfor){
                foundIt = true;
                break;
            }
        }

        if(foundIt){
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
