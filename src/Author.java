public class Author {
    private String authorSurName;
    private String authorName;
    public   Author ( String authorName, String authorSurName ) {
        this.authorName = authorName;
        this.authorSurName = authorSurName;

    }
    public String getAuthorSurName() {
        return  this.authorSurName;
    }
    public String getAuthorName () {
        return  this.authorName;
    }


}
