package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        //Pyramid p = new Pyramid();
        //p.output();
        //Pyramid p = new Pyramid();
        Pyramid.output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs Story = new Adlibs();
    
        System.out.println(Story.Story("Shyanne", 22, "pink"));
        
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Replace replace = new Replace();

        System.out.println(replace.charReplace("I make bread",2,'t'));

    }
}
