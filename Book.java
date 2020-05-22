import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryItem  {
   //Book class inheriting all of the methods and properties of LibraryItem
   private int noOfPages;
   private String checkoutDate;
   private boolean availability;
   private List<Author> authorList= new ArrayList<Author>();
   private  PublishingCompany publishingcompany ;

    public Book(){
        
    }
     public Book(int serialNumber, String title, String authorName, int yearPublished, float price, String publisher,
             String category, int validityPeriod, int noOfPages, String checkoutDate, boolean availability) {
         super(serialNumber, title,  yearPublished, price, publisher, category, validityPeriod);
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
         //Implemeting Author interface methods
         public void noOfAuthors()
         {
             int noOfAuthors=1;
             if(noOfAuthors==2)
                System.out.println("The Java Tutorial has"+ noOfAuthors +" authors");
             else 
             System.out.println("The Java Tutorial has "+ noOfAuthors +" author");
         }
        //Implemeting PublishingCompany interface methods
         
        public void publisherName(){
            System.out.println("TTS");
        }

        public List<Author> getAuthorList() {
            return authorList;
        }

        public void setAuthorList(List<Author> authorList) {
            this.authorList = authorList;
        }

        public PublishingCompany getPublishingcompany() {
            return publishingcompany;
        }

        public void setPublishingcompany(PublishingCompany publishingcompany) {
            this.publishingcompany = publishingcompany;
        }

        @Override
        public String toString() {
            return "Book [authorList=" + authorList + ", availability=" + availability + ", checkoutDate="
                    + checkoutDate + ", noOfPages=" + noOfPages + ", publishingcompany=" + publishingcompany + "]";
        }



}
    
