public class Periodicle extends LibraryItem{
    //Periodicle constructor inheriting all of the methods and properties of LibraryItem
    private String releaseDate;
    public Periodicle(){

    }
    public Periodicle(int serialNumber, String title, String authorName, int yearPublished, float price,
            String publisher, String category, int validityPeriod, String releaseDate) {
        super(serialNumber, title,  yearPublished, price, publisher, category, validityPeriod);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public int availableCheckOutDays(){ 
           System.out.println("Periodicle Checkout period is :" +0 );
           return 0; 
    }
    
    
}