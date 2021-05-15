public class Book {
    private String bookId;
    private String bookName;
    private String arthor;
    private String publisher;
    private int publicYear;
    private int borrowedTime;
    private int borrowing;
    private int inStock;
    private String category;
    
    public Book(String bookId, String bookName, String arthor, String publisher, int publicYear, int borrowedTime,
            int borrowing, int inStock, String category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.arthor = arthor;
        this.publisher = publisher;
        this.publicYear = publicYear;
        this.borrowedTime = borrowedTime;
        this.borrowing = borrowing;
        this.inStock = inStock;
        this.category = category;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getArthor() {
        return arthor;
    }

    public void setArthor(String arthor) {
        this.arthor = arthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public int getBorrowedTime() {
        return borrowedTime;
    }

    public void setBorrowedTime(int borrowedTime) {
        this.borrowedTime = borrowedTime;
    }

    public int getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(int borrowing) {
        this.borrowing = borrowing;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return bookId +" - " + bookName +" - "+ arthor +" - "+ publisher +" - "+ publicYear +" - "+ borrowedTime +" - "+ borrowing +" - "+ inStock +" - "+ category;
    }

}
