

public class Book extends LibraryItem{
   //Book constructor inheriting all of the methods and properties of LibraryItem
   private int noOfPages;
   private String checkoutDate;
   private boolean availability;

    public Book(){
        
    }
     public Book(int serialNumber, String title, String authorName, int yearPublished, float price, String publisher,
             String category, int validityPeriod, int noOfPages, String checkoutDate, boolean availability) {
         super(serialNumber, title, authorName, yearPublished, price, publisher, category, validityPeriod);
         this.noOfPages = noOfPages;
         this.checkoutDate = checkoutDate;
         this.availability = availability;
     }

     public int getNoOfPages() {
         return noOfPages;
     }

     public void setNoOfPages(int noOfPages) {
         this.noOfPages = noOfPages;
     }

     public String getCheckoutDate() {
         return checkoutDate;
     }

     public void setCheckoutDate(String checkoutDate) {
         this.checkoutDate = checkoutDate;
     }

     public boolean isAvailability() {
         return availability;
     }

     public void setAvailability(boolean availability) {
         this.availability = availability;
     }
    //  public void typeOfBook(){
    //     if (this.getCategory().equalsIgnoreCase("Fiction"))
    //      System.out.println("This is General book");
    //       else
    //      System.out.println("This is Reference book");
    //    }
    
        @Override
         public int availableCheckOutDays(){ 
                System.out.println("Book Checkout period is :" +30 );
                return 30; 
         }
}
    
