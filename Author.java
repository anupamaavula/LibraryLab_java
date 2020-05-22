public class Author {

    private String authorName;
    private String  authorPhoneNo;
    private String authorEmail;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPhoneNo() {
        return authorPhoneNo;
    }

    public void setAuthorPhoneNo(String authorPhoneNo) {
        this.authorPhoneNo = authorPhoneNo;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    @Override
    public String toString() {
        return " AuthorEmail=" + authorEmail + "\n AuthorName=" + authorName + ", \n AuthorPhoneNo=" + 
        authorPhoneNo+"\n";
    }
        
}