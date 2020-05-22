import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // LibraryItem libitem1 = new LibraryItem();

        PublishingCompany pc1= new PublishingCompany();
        pc1.setPublisherName("AnuPublisher");
        pc1.setPublisherPhoneNo("7040224444");
        pc1.setPublisherEmail("publisher1@email.com");

        Author author1= new Author();
        author1.setAuthorName("Sam Manuel");
        author1.setAuthorPhoneNo("704556677");
        author1.setAuthorEmail("SMAnuel@email.com");

        Author author2= new Author();
        author2.setAuthorName("WillaimSpear");
        author2.setAuthorPhoneNo("704556333");
        author2.setAuthorEmail("WSpear@email.com");
        List<Author> authorList= new ArrayList<Author>();
        authorList.add(author1);
        authorList.add(author2);


        Book book1 = new Book();
        book1.availableCheckOutDays();
        book1.setPublishingcompany(pc1);
        book1.setAuthorList(authorList);
        System.out.println("Book1 values:"+book1.toString());




        Periodicle p1 = new Periodicle();
        p1.availableCheckOutDays();

        Audio a1 = new Audio();
        a1.availableCheckOutDays();

        Video v1 = new Video();
        v1.availableCheckOutDays();

        CardHolder ch1 = new CardHolder();
        ch1.canCheckOutItems();
        List <String> checkedOutList = ch1.checkedOutItems();
        for (String listItem: checkedOutList) {
            System.out.println("Checkedout List Item :"+listItem);
        }

        
    }
}