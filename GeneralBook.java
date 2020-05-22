public class GeneralBook extends Book implements Reservable,Loanable{
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
    // Implementing methods from ILoanable
    @Override

    public boolean isLoanable()
    {
        return true;
    }
    @Override
    public int minLoanableTime(){
       return 5;
    }
    @Override
    public int maxLoanableTime(){
       return 10;
    }

    
    


}
