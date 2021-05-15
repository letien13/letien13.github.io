import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
    private String memberId;
    private String memberName;
    private String phone;
    private String borrowingBook;
    protected Date returnDate;
    
    public Member(String memberId, String memberName, String phone, String borrowingBook, Date returnDate) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.phone = phone;
        this.borrowingBook = borrowingBook;
        this.returnDate = returnDate;
    }

    public Member() {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBorrowingBook() {
        return borrowingBook;
    }

    public void setBorrowingBook(String borrowingBook) {
        this.borrowingBook = borrowingBook;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String convertDate() {
        String strReturnDate = new SimpleDateFormat("dd/MM/yyyy").format(returnDate);
        return strReturnDate;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return memberId + " - " + memberName + " - " + phone + " - " + borrowingBook + " - " + convertDate();
    }
}
