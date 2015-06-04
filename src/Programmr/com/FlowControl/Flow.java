package Programmr.com.FlowControl;

/**
 * Created by Саманцов on 04.06.2015.
 *
 * Write a java program with the following things done.
 1.) Complete the logic of the program to check whether the number is prime or not.
 Note: If the variable 'num' is prime then display "The number is prime." else display "The number is not prime.".
 2.)Display the output.
 */
public class Flow {
    public static void main(String[] args){
        int num = 11;

        //Write your line here between the start and end comments
        // start

        if(num > 1){
            if((num%1 == 0) & (num%num == 0)){
                System.out.println("The number is prime.");
            }
        } else {
            System.out.println("The number is not prime.");
        }




        //end
    }
}
