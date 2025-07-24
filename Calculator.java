//make a simple calculator by using switch statement in java
import java.util.*;
public class Calculator {
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first value");
        float a = sc.nextFloat();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("enter second value");
        float b = sc.nextFloat();
        switch(operator) {
            case '+' :
                System.out.println(a+b);
            break;
            case '-' :
                System.out.println(a-b);
            break;
            case '*' :
                System.out.println(a*b);
            break;
            case '/' :
                System.out.println(a/b);
            break;
            case '%' :
                System.out.println(a%b);
                break;
            default :System.out.println("wrong operator");

        }

    }
}
