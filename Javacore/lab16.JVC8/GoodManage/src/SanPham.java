import java.util.Scanner;

public class SanPham {
    private String ma, ten, moTa;
    private long giaNhap, giaBan, loiNhuan;
    private int soLuongBan, soLuongTon;

    Scanner sc = new Scanner(System.in);

    public SanPham(String ma, String ten, String moTa, long giaNhap, long giaBan, long loiNhuan, int soLuongBan,
            int soLuongTon) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.loiNhuan = loiNhuan;
        this.soLuongBan = soLuongBan;
        this.soLuongTon = soLuongTon;
    }
    
    public SanPham(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public SanPham() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
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

    public long getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(long loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    

    public void input() {
        System.out.print("Nhap ma: ");
        ma = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        ten = sc.nextLine();
        System.out.print("Nhap gia nhap: ");
        giaNhap = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap gia ban: ");
        giaBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap mo ta: ");
        moTa = sc.nextLine();
        System.out.print("Nhap so luong ban ra: ");
        soLuongBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong ton kho: ");
        soLuongTon = Integer.parseInt(sc.nextLine());
    }

    public long tinhLoiNhuan() {
        loiNhuan = (giaBan - giaNhap) * soLuongBan;
        return loiNhuan;
    }

    @Override
    public String toString() {
        return ma + " - " + ten + " - Gia nhap: " + giaNhap + " - Gia ban: " + giaBan + " - So luong ban: " + soLuongBan + " - So luong ton: "+ soLuongTon +" - Loi nhuan: " + tinhLoiNhuan() + " - Mo ta: " + moTa;
    }

    
}
