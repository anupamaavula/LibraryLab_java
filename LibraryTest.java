import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        // LibraryItem libitem1 = new LibraryItem();

        Book book1 = new Book();
        book1.availableCheckOutDays();

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