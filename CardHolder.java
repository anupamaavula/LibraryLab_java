import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String name;
    private int age;
    private int cardNumber;
    private boolean active;
    private boolean cardExpired;
    private float fineAmount;
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

        checkedOutList.add("Book1");
        checkedOutList.add("Book2");
        checkedOutList.add("General book1");
        checkedOutList.add("Magazine");
        checkedOutList.add("General book2");
        return checkedOutList;
    }



}