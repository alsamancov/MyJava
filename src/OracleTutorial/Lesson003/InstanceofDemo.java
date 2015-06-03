package OracleTutorial.Lesson003;

/**
 * Created by Саманцов on 03.06.2015.
 */
public class InstanceofDemo {
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
        System.out.println("obj2 isntanceof Parent: "
                + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));

    }

    static class Parent{}
    static class Child extends Parent implements MyInterface{}
    interface MyInterface{}
}
