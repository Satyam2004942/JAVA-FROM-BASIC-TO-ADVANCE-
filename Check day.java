// take inpit from user from(1-7) and print which day it is where 1 - monday 7- sunday...
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class CheckDay {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter day number");
        int day = sc.nextInt();
        switch(day) {
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5: System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default : System.out.println("wrong day number");
        }
    }

}
