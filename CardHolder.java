import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String name;
    private int age;
    private int cardNumber;
    private boolean active;
    private boolean cardExpired;
    
    List <String> checkedOutList = new ArrayList<String>();
    
    // public boolean reserveItems(){

    // }
    public void canCheckOutItems(){
        
        if(cardExpired ==false)
           System.out.println("Can Checkout items");
         else
         System.out.println("Cannot Checkout items");
    }
    public List <String> checkedOutItems(){

        checkedOutList.add("Reference Book1");
        checkedOutList.add("General Book2");
        checkedOutList.add("General book1");
        checkedOutList.add("Reference book2");
        checkedOutList.add("General Book4");
        return checkedOutList;
    }

     



}