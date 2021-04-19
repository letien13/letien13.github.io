import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        SanPham danhsach = new SanPham();
        danhsach.nhapDuLieu();

        boolean check = true;
        while (check) {
            System.out.println("Lua chon: ");
            System.out.println(
                    "1 - In thong tin theo danh muc \\ 2 - In thong tin theo hang \\ 3 - In thong tin theo gia va danh muc \\ 4 - Tim san pham");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
            case 1:
                danhsach.inDanhMuc();
                break;

            case 2:
                danhsach.inHang();
                break;

            case 3:
                danhsach.inGiaDm();
                break;

            case 4:
                danhsach.timSanPham();
                break;

            default:
                break;
            }
        }
        sc.close();
    }
    
}
