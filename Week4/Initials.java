package Week4;

import java.util.Scanner;

public class Initials {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = in.next();
        System.out.println("Enter your SO fist name");
        String second = in.next();

        //compute intials
        String initials = first.substring(0, 1) + " + " + second.substring(0, 1)+ " <3";
        System.out.println(initials);

    }
}
