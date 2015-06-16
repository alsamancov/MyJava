package DerekBanas.Lesson003;

/**
 * Created by Саманцов on 16.06.2015.
 */
public class LessonThree {
    public static void main(String[] args){
        int randomNumber = (int)(Math.random() * 50);

        if(randomNumber < 25){
            System.out.println("The random number is less than 25");
        } else if(randomNumber > 40){
            System.out.println("The random number is greater than 40");
        } else if (randomNumber == 18){
            System.out.println("The random number is equal to 18");
        } else if(randomNumber != 40){
            System.out.println("The random number is not equal 40");
        } else {
            System.out.println("Nothing Worked");
        }

        if(!(false)){
            System.out.println("\nI turned false into true");
        }
        if((true) & (true)){
            System.out.println("Both are true");
        }

        System.out.println("The random number is " + randomNumber);

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println(biggestValue);
    }
}
