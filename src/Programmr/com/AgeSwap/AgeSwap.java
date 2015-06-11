package Programmr.com.AgeSwap;

import java.util.Scanner;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * Problem:
 One day your Martian friend walked into a pub to taste some beer.
 Unfortunately he is 20 years and 11 months old. They would not
 let him into the pub. Your friend is kind of sad because he is
 returning to Mars in about a week, and will not get a chance to
 taste Earth beer. You offer to swap ages with your friend for a
 day.
 In the exercise below, you have to write code to swap the values
 of two integer variables.

 What we expect:
 When you run this exercise, it will first ask you for your age.
 Then it asks you for the age of your Martian friend. You have to
 enter valid integers for both (enter any valid integer). Your age
 will be given to you in the variable called 'yourAge', and the
 Martian's age will be given to you in the variable 'martiansAge'.
 You have to write code to swap the values in both the variables.
 The program will print both the variables and we will expect that
 their values have been swapped.

 Learning outcomes:
 After completing this exercise, you should have understood how to
 create a variable, how to assign a value to a variable and how to
 assign the value from one variable to another.
 */
public class AgeSwap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Age : ");
        int yourAge = scanner.nextInt();
        System.out.println("The Martian's age : ");
        int martiansAge = scanner.nextInt();
        ///{
        //start your coding here
        int temp = yourAge;
        yourAge = martiansAge;
        martiansAge = temp;

        // end
        ///}
        System.out.println("Swapped: ");
        System.out.println("Your age :" + yourAge);
        System.out.println("Martian's age :" + martiansAge);
    }
}
