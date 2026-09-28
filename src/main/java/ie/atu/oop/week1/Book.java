package ie.atu.oop.week1;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private BookStatus status;


public enum BookStatus
    {
    AVAILABLE,
    ON_LOAN
    }


    public Book(String title, String author, int pageCount)
    {
        if(title==null||title.isBlank())
        {
            throw new IllegalArgumentException("Title is null or blank");
        }

        if(author==null||author.isBlank())
        {
            throw new IllegalArgumentException("Author is null or blank");
        }

        if(pageCount<1)
        {
            throw new IllegalArgumentException("Page count is null or blank");
        }

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.status = BookStatus.AVAILABLE;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }
    public BookStatus getStatus() {
    return status;
    }
    public void borrowBook(){
    if(status==BookStatus.ON_LOAN){
        throw new IllegalStateException("Book is already on LOAN");
    }
    status=BookStatus.ON_LOAN;
    }
    public void returnBook(){
    if(status==BookStatus.AVAILABLE){
        throw new IllegalStateException("Book is already AVAILABLE");
    }
    if(status==BookStatus.ON_LOAN){
        status=BookStatus.AVAILABLE;
    }
    }
}
