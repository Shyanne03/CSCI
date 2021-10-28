package Week2;

public class CatNames {
    static String catName =  "Momo";
    //String catName = "Appa"
    
    //When not to use static?
    public static void main(String[] args) {
        String catName = "Appa";

        //System.out.println(catName);

        //System.out.println(CatNames.catName);
        

        Access gregHouse = new Access();
        //System.out.println(gregHouse.cat1);
        System.out.println(gregHouse.getCat1()); 
        System.out.println(gregHouse.getCat2());
    }

}
