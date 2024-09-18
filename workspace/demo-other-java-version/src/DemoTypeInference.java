import java.util.ArrayList;
import java.util.LinkedList;

public class DemoTypeInference{
    public static void main(String[] args) throws Exception {
        int age = 5;
        var age2 = 5;
        // Java Complier covert "var" to int under the hood
        // because you assign int value 5 to it 
        // !!! var type never exists in byte code (Class file) !!!
        // age 2 = 5.0; // double value

        String name = "John";
        var name2 = "John";
        name2.charAt(2); // vsCode helps here to identify the type of var type variable, not by compiler

        var strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("def");

        for (var string : strings) {
            System.out.println(string);
        }

        // re-assign value to var type variable
        age2 = 10; //!!! re-assign value to var type variable FOR same type only
        // method input parameter type
        // !!! cannot use as input type
        // method output parameter type
        // !!! cannot use as output type
        // class attribute type
        // !!! cannot use as class attribute type
        // assign null value to var type variable
        // !!! cannot use as null value

        // lambda expression
        // var l = () -> "abc";







    }
}
