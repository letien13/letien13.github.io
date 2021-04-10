public class DoAn extends Sach implements IKho {
    private int page, projectYear;
    private String status, location;
    public DoAn(String bookId, String bookName, String publisher, int publicYear, int page, int projectYear,
            String status, String location) {
        super(bookId, bookName, publisher, publicYear);
        this.page = page;
        this.projectYear = projectYear;
        this.status = status;
        this.location = location;
    }
    public DoAn(int page, int projectYear, String status, String location) {
        this.page = page;
        this.projectYear = projectYear;
        this.status = status;
        this.location = location;
    }
    public DoAn() {
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getProjectYear() {
        return projectYear;
    }
    public void setProjectYear(int projectYear) {
        this.projectYear = projectYear;
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

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so trang: ");
        page = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap tinh trang: ");
        status = sc.nextLine();
        System.out.print("Nhap nam bao ve: ");
        projectYear = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vi tri: ");
        location = sc.nextLine();
    }

    @Override
    public String viTri() {
        return location;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + page + " - " + status + " - " + projectYear + " - " + location;
    }
}
