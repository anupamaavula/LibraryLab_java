public class Video extends LibraryItem{
    private String contenFormat;    //cd or online
    private float length;//Duration

    public Video(){}

    public Video(int serialNumber, String title, String authorName, int yearPublished, float price, String publisher,
            String category, int validityPeriod, String contenFormat, float length) {
        super(serialNumber, title,  yearPublished, price, publisher, category, validityPeriod);
        this.contenFormat = contenFormat;
        this.length = length;
    }

    public String getContenFormat() {
        return contenFormat;
    }

    public void setContenFormat(String contenFormat) {
        this.contenFormat = contenFormat;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
         public int availableCheckOutDays(){ 
                System.out.println("Video Checkout period is :" +5 );
                return 5; 
         }
    
}