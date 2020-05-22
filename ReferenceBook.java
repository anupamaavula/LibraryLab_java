public class ReferenceBook extends Book implements Reservable{
    private boolean isYearBook;
    

    public ReferenceBook(int serialNumber, String title, String authorName, int yearPublished, float price,
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

    // Implementing methods from IReservable
    @Override
    public boolean isReservable()
    {
       
            return true;
    }
    @Override
    public int minReservableTime()
    {
        return 5;
    }
    @Override
    public int maxReservableTime()
    {
        return 10;
    }

    


}