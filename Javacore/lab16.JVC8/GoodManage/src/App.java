import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("So luong san pham can nhap: ");
            n = Integer.parseInt(sc.nextLine());
            while (n<=0 || n>=100) {
                System.out.println("So luong nhap khong cho phep");
                System.out.print("Nhap lai so luong: ");
                n = Integer.parseInt(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("So luong khong hop le !!!");
        }

        ArrayList<SanPham> sanpham = new ArrayList<SanPham>(n);
  
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            sp.input();
            sanpham.add(i, sp);
        }

        for (SanPham insp : sanpham) {
            System.out.println(insp);
        }
       
        boolean check = true;
        while (check) {
            SanPham sp2 = new SanPham();
            System.out.println("Nhap lua chon:");
            System.out.println("1- Them san pham; 2 - Sua san pham; 3 - Xoa san pham; 4 - Thoat chinh sua");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
            case 1:
                sp2.input();
                sanpham.add(sp2);
                break;

            case 2:
                System.out.println("Nhap san pham can sua:");
                int change = Integer.parseInt(sc.nextLine());
                sp2.input();
                sanpham.set(change, sp2);
                break;

            case 3:
                System.out.println(("Nhap san pham muon xoa:"));
                int delete = Integer.parseInt(sc.nextLine());
                sanpham.remove(delete);
                break;

            case 4:
                check = false;
                break;

            default:
                break;
            }
        }
        
        System.out.println("Danh sach san pham sau khi sua: ");
        for (SanPham insp : sanpham) {
            System.out.println(insp);
        }

        for (int i = 0; i < n; i++) {
            if (sanpham.get(i).getSoLuongTon() < 5) {
                System.out.println("Nhap them san pham thu "+i);
            }
        }
        
    }
}
