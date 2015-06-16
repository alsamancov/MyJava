package DerekBanas.Lesson002;

import java.util.Scanner;

/**
 * Created by Саманцов on 30.05.2015.
 */
public class JavaLessonTwo {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();

            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - " + 2 + " = " + numEnteredMinus2);

            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);

            int numEnteredDivide2 = numberEntered / 2;
            System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);

            int numEnteredRemainder = numberEntered % 2;
            System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);

            numberEntered += 2;
            numberEntered -= 2;

            numberEntered--;
            numberEntered++;

            int numberABS = Math.abs(numberEntered);
            System.out.println(numberABS);

            int whichIsBigger = Math.max(5, 8);
            System.out.println(whichIsBigger);
            int whichIsMinner = Math.min(5, 8);
            System.out.println(whichIsMinner);

            double numSqrt = Math.sqrt(25);
            System.out.println(numSqrt);

            int numCeiling = (int) Math.ceil(5.23);
            System.out.println(numCeiling);
            int numCeiling2 = (int) Math.floor(5.23);
            System.out.println(numCeiling2);
            int numRound = (int) Math.round(5.53);
            System.out.println(numRound);
            int randomNumber = (int)(Math.random() * 11);

            System.out.println(randomNumber);
        } else {
            System.out.println("Enter an integer next time");
        }
    }
}
