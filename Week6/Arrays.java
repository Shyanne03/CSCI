package Week6;

import java.util.Scanner;

public class Arrays {
    //arrays: used to store multiple variables in a single variable
    public static void main(String[] args) {
        //basic way to make an array, this is a blank array, integer array
        int[] anArray;
        //define array size this one will have 10 integers
        anArray = new int[10];
        // this would have 10 undefined values (null)
        // to add a vaue to the first slot of the array:
        anArray[0] = 100;
        System.out.println(anArray[0]);
        //this tells us what is in the 0th spot of the array, so 100 is returned
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        System.out.println(anArray[9]);

        //another way to make an array if we know the values before hand
        int[] shortArray = {
            0,1,2,3,4,5,6,7,8,9
        };
        for (int i : shortArray) {
            System.out.println(i);
        }
        String[] name = {"Appa", "Momo", "Jack"};
        System.out.println(name[0]);
        for(int i =0; i <name.length; i++){
            System.out.println(name[i]);
        }
        System.out.println("For each");

        for(String string : name) {
            System.out.println(string);
        }
        String[] nameunknown = new String[200];
        nameunknown[0] = "Greg";
        nameunknown[1] = "George";
        nameunknown[2] = "Ryan";
        nameunknown[3] = "Sam";
        
        System.out.println(nameunknown[2]);

        Scanner keyboard = new Scanner(System.in)
        System.out.println("Enter Word");
        String str = keyboard.next();

        nameunknown[4] = str;

        for (String string = nameunknown) {
            System.out.println(string);
        }
        //reate array of string str length 
        char[] ch = new char[str.length()];

        //copy har by char into array
        for(int i = 0,i <str.length(; i ++){
            ch[i] = str.charAt(i);
        }

        System.out.println(ch);

        for(char c : ch) {
            System.out.println("Char: "+c);
        }
    }
    
}
