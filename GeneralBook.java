public class GeneralBook extends Book{
    private boolean isYearBook;

    public GeneralBook(int serialNumber, String title, String authorName, int yearPublished, float price,
            String publisher, String category, int validityPeriod, int noOfPages, String checkoutDate,
            boolean availability, boolean isYearBook) {
        super(serialNumber, title, authorName, yearPublished, price, publisher, category, validityPeriod, noOfPages,
                checkoutDate, availability);
        this.isYearBook = isYearBook;
    }

    public boolean isYearBook() {
        return isYearBook;
    }

    public void setYearBook(boolean isYearBook) {
        this.isYearBook = isYearBook;
    }

    
    


}
