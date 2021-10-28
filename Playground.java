public class Playground {
    public static void main(String[] args) {
        // STRING PLAYGROUND
        String name = "Shyanne";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //HOMEWORK
        System.out.println(name.replace("n", "T"));


        // METHOD PLAYGROUND 

        //METHOD WITH VOID
        //add exlaationPoint(name);

        //METHOD WITHOUT VOID (STRING)
        addExclamationPoint(name);

        String exclaimName = newAddExclamationPoint(name);
        System.out.println(exclaimName);

        //System.out.println(newAddExclamationPoint(name));
        // Create a friend object
        Friend newFriend = new Friend();
        //Cal my friend name method
        String friendName = newFriend.myFriendName();
        System.out.println(friendName);

        //Call validateFriend method with the variable name 
        //name = Shyanne
        String validateFriend = newFriend.validateFriend(name);
        System.out.println(validateFriend);
        System.out.println(newFriend.validateFriend("jake"));

        Counter count = new Counter();
        //System.out.println(count.value)
        //0
        System.out.println(count.getValue());
        //1
        count.click();
        System.out.println(count.getValue());
        //2
        count.click();
        System.out.println(count.getValue());
        count.click();
        count.click();
        count.click();
        System.out.println(count.getValue());
        count.minusClick();
        System.out.println(count.getValue());
        count.reset();
        System.out.println(count.getValue());

    }
    // make a method
    // method addExclamationPoint
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");

    }
    //make a method that returns a string without void
    public static String newAddExclamationPoint(String s) {
        return s + "!";


    }
}
