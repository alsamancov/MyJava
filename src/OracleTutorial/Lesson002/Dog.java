package OracleTutorial.Lesson002;

/**
 * Created by Саманцов on 31.05.2015.
 */
public class Dog {
    String name;
    int age;
    //double float;
    public void getAge(int newAge){
        int localAge = 5;
        System.out.println(localAge + newAge);
    }

   public static void main(String[] args){
        Dog dog  = new Dog();
   	    dog.getAge(5);
       System.out.println(dog.age);
       System.out.println(dog.name);
       //System.out.println(dog.float);
   }


}
