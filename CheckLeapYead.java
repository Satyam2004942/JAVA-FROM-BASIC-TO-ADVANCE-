//write a java program which takes year from the user and print whether the year is leap year or not
import java.util.*; //standard java package that contains utility classes allow us to use scanner class
public class CheckLeapYear {
    public static void main(String args []) {
        Scanner sc = new Scanner (System .in ); // a java class that llow us to take input from the user
        System.out.println("enter year");
        int year = sc.nextInt();
        boolean x = (year%4) == 0; // if a year is divisible by 4 and not by 100 then it is a leap year
        boolean y = (year%100) !=0;
        boolean z = (year%100==0) && (year%400==0); // if a year is divisible by 100 the it has also be divisible by 400 tehn only that year is a leap year..
        if (x &(y||z)) {
            System.out.println(year + " leap year");
        }
        else {
            System.out.println(year + " not a leap year");
        }

        }

}
