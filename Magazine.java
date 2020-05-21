public class Magazine extends Periodicle{
    private int frequencyOfArrival;

    
    public void getbookArrivalFrequency(){

        switch(frequencyOfArrival){
            case 1:
                System.out.println("Daily"); 
                break;
            case 7:
                System.out.println("Weekly"); 
                break;
            case 30:
            System.out.println("Monthly"); 
                break;
        }
        

    }

    public Magazine(int serialNumber, String title, String authorName, int yearPublished, float price, String publisher,
            String category, int validityPeriod, String releaseDate, int frequencyOfArrival) {
        super(serialNumber, title, authorName, yearPublished, price, publisher, category, validityPeriod, releaseDate);
        this.frequencyOfArrival = frequencyOfArrival;
    }

    public int getFrequencyOfArrival() {
        return frequencyOfArrival;
    }

    public void setFrequencyOfArrival(int frequencyOfArrival) {
        this.frequencyOfArrival = frequencyOfArrival;
    }

}