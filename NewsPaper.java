public class NewsPaper extends Periodicle {
    
    private String owner;
    private String Editor;

    public NewsPaper(int serialNumber, String title, String authorName, int yearPublished, float price,
            String publisher, String category, int validityPeriod, String releaseDate, String owner, String editor) {
        super(serialNumber, title, authorName, yearPublished, price, publisher, category, validityPeriod, releaseDate);
        this.owner = owner;
        Editor = editor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String editor) {
        Editor = editor;
    }

    
    
    
}