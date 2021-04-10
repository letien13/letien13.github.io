import java.util.Scanner;

public class Sach {
    private String bookId, bookName, publisher;
    private int publicYear;
    Scanner sc = new Scanner(System.in);
    public Sach(String bookId, String bookName, String publisher, int publicYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publisher = publisher;
        this.publicYear = publicYear;
    }
    public Sach() {
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
    
    public void input() {
        System.out.print("Nhap ma sach: ");
        bookId = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        bookName = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        publisher = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        publicYear = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return bookId + " - " + bookName + " - " + publisher + " - " + publicYear;
    }

    
}
