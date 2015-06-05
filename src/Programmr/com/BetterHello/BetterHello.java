package Programmr.com.BetterHello;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * Problem: The Martians are very pleased with your hospitality,
 * but they are quite amused that you hard coded the greeting
 * message in System.out.println(“Hello Martians”); in your first
 * exercise. They would really prefer to use a variable to hold
 * the value of the greeting and print the variable	instead of a
 * hard coded message. Additionally they also want you to print
 * your age. The local geek has already created two variables for
 * you, 'greeting', and 'age', which will hold the greeting text
 * and age respectively.. You are supposed to give values to the
 * variables such that “Hello Martians I am 27 years old” will be
 * printed when the program is run.

 What we expect: We expect the String “Hello Martians I am 27 years
 old” to appear on the system console. We also expect that the
 variables ‘greeting’ and ‘age’ will have the appropriate values of
 ‘Hello Martians’ and 27 respectively.

 Hint: You can print multiple values on the system console, by
 using the ‘+’ operator

 Learning Outcomes: After completing this exercise you should have
 understood:
 ●	What is a variable
 ●	How to declare a variable that can contain a String
 ●	How to declare a variable that can contain an integer
 ●	How to assign a value to a variable
 ●	How to print multiple values to the system console
 */
public class BetterHello {
    public static void main(String[] args){
        String greeting = "Hello Martians";
        int age = 38;

        ///{
        //write your code here
        //start
        System.out.println(greeting + " I am " + age + " years old");






        //end
        ///}
    }
}
