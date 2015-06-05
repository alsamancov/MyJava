package Programmr.com.TestReferences;

import java.util.Date;

/**
 * Created by Саманцов on 05.06.2015.
 * The below example demonstrates how to work with references
 * in java. The example below uses references of variable to
 * generate output for user.
 */
public class TestReferences {
    public static void main(String[] args){
        int firstInt = 12;
        int secondInt = 12;
        boolean theSameInt = (firstInt == secondInt);
        System.out.println("Same integer: " + theSameInt);

        Date firstDate = new Date();
        long time = firstDate.getTime();
        Date secondDate = new Date(time);
        // boolean theSameDate = (firstDate == secondDate);
        boolean theSameDate = firstDate.equals(secondDate);
        System.out.println("Same date: " + theSameDate);

    }
}
