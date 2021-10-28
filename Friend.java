
//New Friend Class
//Friend objet
public class Friend {
    //method MyFriendName
    public static String myFriendName() {
        //return friend name
        return "My Name is Bob";
    }

    public static String validateFriend(String name) {
        if (name.contains("Shyanne")){
            return "Oh Hey "+name+" how are you today?";
        } else if (name.matches("[a-z]+")){
            return "I don't believe we have met... it's nice to meet you "+name;
        } else{
            return "Bye, I don't know you";
        } 
    }
}
