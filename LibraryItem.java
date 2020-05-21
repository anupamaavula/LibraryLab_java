public class LibraryItem{
    //properties
    private int serialNumber;
    private String title;
    private String authorName;
    private int yearPublished;
    private float price;
    private String publisher;
    private String category;
    private int validityPeriod;

    public LibraryItem(){}

    public LibraryItem(int serialNumber, String title, String authorName, int yearPublished, float price,
            String publisher, String category,int validityPeriod) {
        this.serialNumber = serialNumber;
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.price = price;
        this.publisher = publisher;
        this.category = category;
        this.validityPeriod=validityPeriod;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getValidityPeriod() {
        return validityPeriod;
    }
    public void setValidityPeriod(int validityPeriod) {
        this.validityPeriod = validityPeriod;
    }
    @Override
    public String toString() {
        return this.getSerialNumber() + " "+this.getTitle() + " "+this.getCategory();
    }

    
    public  int availableCheckOutDays(){
         return validityPeriod;
    }
    
}


