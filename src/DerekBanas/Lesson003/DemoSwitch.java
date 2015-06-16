package DerekBanas.Lesson003;

/**
 * Created by Саманцов on 16.06.2015.
 */
public class DemoSwitch {
    public static void main(String[] args){
        char  theGrade = 'B';

        switch (theGrade){
            case 'A':
                System.out.println("Great job");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Ok");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("You Failed");
                break;
        }
    }
}
