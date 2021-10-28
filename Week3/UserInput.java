package Week3;

import java.util.Scanner;

public class UserInput {
    //initiate scanner with system in
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        String name = keyboard.nextLine();
        System.out.println("hello," + name +" It's nice to meet you");
    }
}
