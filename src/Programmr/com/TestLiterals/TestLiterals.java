package Programmr.com.TestLiterals;

/**
 * Created by Саманцов on 05.06.2015.
 *
 * The below example demonstrates how to assign literal values to
 * variables of different data-types.
 The below example assigns literal values to the field members of
 different data-types and prints the field members as output.
 */
public class TestLiterals {
    public static void main(String[] args){
        boolean isManagment;
        char middleInitial;
        byte teenYear;
        short lifeSpan;
        int population;
        long grainsOfSand;
        float salary;
        double nationalDebt;
        String name;

        isManagment = false;
        middleInitial = 'a';
        teenYear = 12;
        lifeSpan = 88;
        population = 1234567;
        grainsOfSand = 100000000;
        salary = 55000.00F;
        nationalDebt = 88123455666666.99;
        name = "Paul Westerberg";

        System.out.println(isManagment);
        System.out.println(middleInitial);
        System.out.println(teenYear);
        System.out.println(lifeSpan);
        System.out.println(population);
        System.out.println(grainsOfSand);
        System.out.println(salary);
        System.out.println(nationalDebt);
        System.out.println(name);
    }
}
