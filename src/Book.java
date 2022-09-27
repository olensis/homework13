public class Book {
    private int yearOfPublication;
    private String publisherName;

    public Book (String publisherName, int yearOfPublication) {
        this.publisherName = publisherName;
        this.yearOfPublication = yearOfPublication;


    }
    public String getPublisherName () {
        return this.publisherName;
    }
    public int getYearOfPublication () {
        return this.yearOfPublication;

    }
    public void setYearOfPublication (int yearOfPublication ) {
        this.yearOfPublication = yearOfPublication;

    }

}
