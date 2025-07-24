import java.util.*;
public class LargestOfThreeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first number");
        float a = sc.nextFloat();
        System.out.println("enter second number");
        float  b = sc.nextFloat();
        System.out.println("enter third number");
        float c = sc.nextFloat();
        if(a>b && a>c) {
            System.out.println("a is largest");
        }
        else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else {
            System.out.print("c is largest");

        }
    }
}
