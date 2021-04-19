import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPham {
    private String maSP, ten, moTa, hang, danhMuc;
    private long giaNhap, giaBan;
    private int soTon, soBan;

    List<SanPham> sanpham;

    Scanner sc = new Scanner(System.in);

    public SanPham(String maSP, String ten, String moTa, String hang, String danhMuc, long giaNhap, long giaBan, int soTon, int soBan) {
        this.maSP = maSP;
        this.ten = ten;
        this.moTa = moTa;
        this.hang = hang;
        this.danhMuc = danhMuc;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soTon = soTon;
        this.soBan = soBan;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public long getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoTon() {
        return soTon;
    }

    public void setSoTon(int soTon) {
        this.soTon = soTon;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public void input() {
        System.out.print("Nhap ma sp: ");
        maSP = sc.nextLine();
        System.out.print("Nhap ten sp: ");
        ten = sc.nextLine();
        System.out.print("Nhap mo ta: ");
        moTa = sc.nextLine();
        System.out.print("Nhap gia nhap: ");
        giaNhap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia ban: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong ton: ");
        soTon = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong ban: ");
        soBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap hang: ");
        hang = sc.nextLine();
        System.out.print("Nhap danh muc: ");
        danhMuc = sc.nextLine();
    }

    @Override
    public String toString() {
        return maSP + " - " + ten + " - Mo ta: " + moTa + " - Gia nhap: " + giaNhap + " - Gia ban: " + giaBan
                + " - So luong ton: " + soTon + " - So luong ban: " + soBan + " - Hang: " + hang + " - Danh muc: "
                + danhMuc;  
    }

    public SanPham(List<SanPham> sanpham) {
        this.sanpham = sanpham;
    }

    public List<SanPham> getSanpham() {
        return sanpham;
    }

    public void setSanpham(List<SanPham> sanpham) {
        this.sanpham = sanpham;
    }

    public void nhapDuLieu() {
        sanpham = new ArrayList<SanPham>();
        System.out.print("So san pham muon nhap thong tin: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            sp.input();
            sanpham.add(i, sp);
        }

        for (SanPham s : sanpham) {
            System.out.println(s.toString());
        }
    }

    public void inDanhMuc() {
        System.out.println("Nhap danh muc muon in: ");
        System.out.println("1 - Dien thoai \\ 2 - Laptop \\ 3 - Apple \\ 4 - Phu kien");
            int indanhmuc = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < sanpham.size(); i++) {
                switch (indanhmuc) {
                case 1:
                    if (sanpham.get(i).getDanhMuc().equalsIgnoreCase("Dien thoai")) {
                        System.out.println(sanpham.get(i).toString());
                    }
                    break;

                case 2:
                    if (sanpham.get(i).getDanhMuc().equalsIgnoreCase("Laptop")) {
                        System.out.println(sanpham.get(i).toString());
                    }
                    break;

                case 3:
                    if (sanpham.get(i).getDanhMuc().equalsIgnoreCase("Apple")) {
                        System.out.println(sanpham.get(i).toString());
                    }
                    break;

                case 4:
                    if (sanpham.get(i).getDanhMuc().equalsIgnoreCase("Phu kien")) {
                        System.out.println(sanpham.get(i).toString());
                    }
                    break;

                default:
                    break;
                    }
                }
               
    }

    public void inHang() {
        System.out.print("Nhap ten hang muon tim: ");
        String tenhang = sc.nextLine();
        for (int i = 0; i < sanpham.size();i++) {
            if (sanpham.get(i).getHang().equalsIgnoreCase(tenhang)) {
                System.out.println(sanpham.get(i).toString());
            } else {
                System.out.println("Khong tim thay san pham");
            }
        }
    }
    
    public void inGiaDm() {
        System.out.println("Chon muc gia ");
        System.out.println("1 - Duoi 2tr \\ 2 - Tu 2-4tr \\ 3 - Tu 4-7tr \\ 4 - Tu 7-13tr \\ 5 - Tren 13tr ");
        int mucgia = Integer.parseInt(sc.nextLine());
        switch (mucgia) {
        case 1:
            for (int i = 0; i < sanpham.size(); i++) {
                if (sanpham.get(i).getGiaBan() < 2000000) {
                    inDanhMuc();
                }
            }
            break;

        case 2:
            for (int i = 0; i < sanpham.size(); i++) {
                if (sanpham.get(i).getGiaBan() >= 2000000 && sanpham.get(i).getGiaBan() < 4000000) {
                    inDanhMuc();
                }
            }

            break;

        case 3:
            for (int i = 0; i < sanpham.size(); i++) {
                if (sanpham.get(i).getGiaBan() >= 4000000 && sanpham.get(i).getGiaBan() < 7000000) {
                    inDanhMuc();
                }
            }
            break;

        case 4:
            for (int i = 0; i < sanpham.size(); i++) {
                if (sanpham.get(i).getGiaBan() >= 7000000 && sanpham.get(i).getGiaBan() < 13000000) {
                    inDanhMuc();
                }
            }
            break;

        case 5:
            for (int i = 0; i < sanpham.size(); i++) {
                if (sanpham.get(i).getGiaBan() >= 13000000) {
                    inDanhMuc();
                }
            }
            break;

        default:
            break;
        }
    }
    
    public void timSanPham() {
        System.out.println("Nhap san pham can tim: ");
        String timsp = sc.nextLine();
        for (int i = 0; i < sanpham.size(); i++) {
            if (sanpham.get(i).getTen().contains(timsp)) {
                System.out.println(sanpham.get(i).toString());
            } else {
                System.out.println("Khong tim thay san pham");
            }
        }
    }
    
}
