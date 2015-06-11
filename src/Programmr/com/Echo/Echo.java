package Programmr.com.Echo;

import java.util.Scanner;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * Problem:
 You and the Martian start becoming good friends. There
 is so much in common between the two of you - an
 interest in camping on volcanic peaks to hunting for
 quarters in the swimming pool. One summer afternoon,
 you and your Martian friend decide to play a game of
 Echo. The purpose of the game is to echo what the other
 person is saying. If the Martian says "zboggattyu", you
 have to reply back with "zboggattyu".
 The exercise below, asks you to enter some text on the
 system console. This text will be stored in the
 variable 'someText'. This is then copied into another
 variable called '-echo', which is printed back to the
 system console. However, we are unable to get the code
 to compile. You have to get the code to compile, so you
 can play echo with your Martian friend.

 What we expect:
 Primarily, we expect you to get the code to compile.
 Once the code is compiled and run, it will ask you to
 enter a String on the system console. We expect the
 same String is echoed (printed) back on the system
 console.

 Hint:
 There are some rules governing valid variable names

 Learning Outcomes:
 After completing this exercise, you should have learned
 what constitutes a valid variable name.
 */
public class Echo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String someText = scanner.next();
        String echo = someText;
        ///{

        //start your coding here


        //


        ///}
        System.out.println(echo);
    }
}
