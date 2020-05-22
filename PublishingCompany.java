public class PublishingCompany {
    private String publisherName;
    private String  publisherPhoneNo;
    private String publisherEmail;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherPhoneNo() {
        return publisherPhoneNo;
    }

    public void setPublisherPhoneNo(String publisherPhoneNo) {
        this.publisherPhoneNo = publisherPhoneNo;
    }

    public String getPublisherEmail() {
        return publisherEmail;
    }

    public void setPublisherEmail(String publisherEmail) {
        this.publisherEmail = publisherEmail;
    }

    @Override
    public String toString() {
        return "PublishingCompany [publisherEmail=" + publisherEmail + ", publisherName=" + publisherName
                + ", publisherPhoneNo=" + publisherPhoneNo + "]";
    }

    


}