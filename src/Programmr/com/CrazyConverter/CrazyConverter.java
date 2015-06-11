package Programmr.com.CrazyConverter;

import java.util.Scanner;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * Problem:
 You and your Martian friend go hiking up Mount Vesuvius.
 While exchanging stories at the campfire, he tells you
 about this grocer on Mars. He says, "Ze is the best
 grocer in this galaxy, but you have to respect ze
 wishes." It seems Ze sells only two items - Zomatoes,
 and Zinions. But that's not all. Ze will not sell you
 an arbitrary number of items. The minimum order is 65
 and the maximum order is 122. What's more, you cannot
 ask for 65 Zomatoes. You have to ask for 'A' Zomatoes.
 Similarly, you cannot ask for 122 Zinions. You have to
 ask for 'z' Zinions. Confused ? The ASCII value of
 (uppercase) 'A' is 65 and the ASCII value of
 (lowercase) 'z' is 122.
 In this exercise you have to add the ASCII values of 2
 char variables.

 What we expect:
 In this exercise, Ze will ask you for the number of
 Zomatoes and Zinions you want to buy. You have to enter
 an ASCII character in the range [A-Za-z] for both. The
 number of Zomatoes you want to buy will be given to you
 in a variable called 'zomatoes', which is of type
 'char'. The number of 'Zinions' you want to buy will be
 given to you in a variable called 'zinions', which is
 also of type char. You have to add the ASCII values of
 both the char variables (zomatoes and zinions) and
 populate the variable called 'items', which is of type
 'int', with the sum. For example if you asked for 'a'
 Zomatoes and 'C' Zinions, the total number of items is
 'a'(97) + 'C'(67) = 164

 Hint:
 Typecasting ! nuff said.
 */
public class CrazyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello I am your friendly grocer Darth: ");
        System.out.println("How many zomatoes do you want ? (Enter a character in the range [A-Za-z]): ");
        String sZomatoes = scanner.nextLine();
        System.out.println("How many zinions do you want ? (Enter a character in the range [A-Za-z]): ");
        String sZinions = scanner.nextLine();

        char zomatoes = sZomatoes.charAt(0);
        char zinions = sZinions.charAt(0);
        int items = 0;
        ///{

        //start your coding here
        items = zomatoes +  zinions;

        //end


        ///}
        System.out.println("Thank you ! you have asked for " + items + " items");


    }
}
