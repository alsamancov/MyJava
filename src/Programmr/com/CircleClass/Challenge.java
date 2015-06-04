package Programmr.com.CircleClass;
import java.util.Scanner;

/**
 * Created by Саманцов on 04.06.2015.
 *
 * Ask for a radius and the color of a circle. Compute the area and print the color.

 Input:
 23
 pink
 Output:
 1661.9025137490005
 pink


 Input:
 1
 green
 Output:
 3.141592653589793
 green
 */
public class Challenge {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter radius:");
        double rad=scanner.nextDouble();
        System.out.println("Enter color:");
        String col = scanner.next();

        myCircle mc = new myCircle(rad, col);

        System.out.println(mc.getArea());
        System.out.println(mc.color);
    }

}

class myCircle{
    ///{write your code here
    double rad;
    String color;
    final double PI_NUM = 3.141592653589793;
    public myCircle(){
    }
    public myCircle(double rad, String col){
        this.rad = rad;
        this.color = col;
    }



    public double getArea(){
        double area = PI_NUM * (rad * rad);
        return area;
    }
    ///}
}
