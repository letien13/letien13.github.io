public class EDocument extends Sach implements IDownload {
    private String size;
    private int download;
    private long price;
    public EDocument(String bookId, String bookName, String publisher, int publicYear, String size, int download,
            long price) {
        super(bookId, bookName, publisher, publicYear);
        this.size = size;
        this.download = download;
        this.price = price;
    }
    public EDocument(String size, int download, long price) {
        this.size = size;
        this.download = download;
        this.price = price;
    }
    public EDocument() {
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getDownload() {
        return download;
    }
    public void setDownload(int download) {
        this.download = download;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap dung luong: ");
        size = sc.nextLine();
        System.out.print("Nhap luot tai: ");
        download = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia thanh: ");
        price = Integer.parseInt(sc.nextLine());
    }
    @Override
    public void tongTien() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + size + " - " + download + " - " + price;
    }
}
