public class Audio extends LibraryItem{
    private String contenFormat;    //cd or online
    private float length;

    public Audio(){}

    public Audio(int serialNumber, String title, String authorName, int yearPublished, float price, String publisher,
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
                System.out.println("Audio Checkout period is :" +3 );
                return 3; 
         }
    

}
