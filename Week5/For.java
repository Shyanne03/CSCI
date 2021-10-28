package Week5;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        // for loop exeutes a block of code a limited amount of times
        //need initialization variable (usually i), condition, iteration (optional)
        for(int i = 0; i<=10;i++){
            System.out.println(i);
        }

        //decrement variables
        for(int i = 10; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("Happy New Year");

        Scanner keyboard = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = keyboard.nextInt();
        System.out.println("Enter number of columns: ");
        columns = keyboard.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = keyboard.next();

        System.out.println(rows+""+ columns + symbol);

        for(int i = 1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                //inner loop is charge of the columns until it reahes the end then it moves back to the outer loop
                System.out.print(symbol);

            }
        }

    }
}
