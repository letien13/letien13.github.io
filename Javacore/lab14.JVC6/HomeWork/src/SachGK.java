public class SachGK extends Sach implements IMuon, IKho {
    private String status, location;
    private int page, quantity, borrow, stock;
    public SachGK(String bookId, String bookName, String publisher, int publicYear, String status, String location,
            int page, int quantity, int borrow, int stock) {
        super(bookId, bookName, publisher, publicYear);
        this.status = status;
        this.location = location;
        this.page = page;
        this.quantity = quantity;
        this.borrow = borrow;
        this.stock = stock;
    }
    public SachGK(String status, String location, int page, int quantity, int borrow, int stock) {
        this.status = status;
        this.location = location;
        this.page = page;
        this.quantity = quantity;
        this.borrow = borrow;
        this.stock = stock;
    }
    public SachGK() {
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    public int getborrow() {
        return borrow;
    }
    public void setborrow(int borrow) {
        this.borrow = borrow;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so trang: ");
        page = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap tinh trang: ");
        status = sc.nextLine();
        System.out.print("Nhap so luong: ");
        quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong muon: ");
        borrow = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri: ");
        location = sc.nextLine();
    }

    @Override
    public int tonKho() {
        this.stock = this.quantity - this.borrow;
        return this.stock;
    }

    @Override
    public String viTri() {
        return location;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + page + " - " + status + " - So luong: " + quantity + " - Muon:" + borrow + " - Ton kho: " + this.stock
                + " - " + location;
    }
}
