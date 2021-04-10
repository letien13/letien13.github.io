import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<SachGK> sachGK = new ArrayList<SachGK>();
        ArrayList<DoAn> doAn = new ArrayList<DoAn>();
        ArrayList<EDocument> eBook = new ArrayList<EDocument>();

        System.out.print("So luong sach giao khoa muon nhap: ");
        int sgk = sc.nextInt();
        System.out.println("Nhap thong tin sach giao khoa: ");
        for (int i = 0; i < sgk; i++) {
            System.out.printf("Nhap sach thu %d: \n", i + 1);
            SachGK s = new SachGK();
            s.input();
            sachGK.add(s);
        }
       
        System.out.print("So luong do an muon nhap: ");
        int doan = sc.nextInt();
        System.out.println("Nhap thong tin do an: ");
        for (int i = 0; i < doan; i++) {
            System.out.printf("Nhap do an thu %d: \n", i + 1);
            DoAn d = new DoAn();
            d.input();
            doAn.add(d);
        }

        System.out.print("So luong sach dien tu muon nhap: ");
        int ebook = sc.nextInt();
        System.out.println("Nhap thong tin ebook: ");
        for (int i = 0; i < ebook; i++) {
            System.out.printf("Nhap ebook thu %d: \n", i + 1);
            EDocument e = new EDocument();
            e.input();
            eBook.add(e);
        }

        System.out.println("Thong tin sach giao khoa: ");
        for (SachGK s : sachGK) {
            System.out.println(s.toString());
        }

        System.out.println("Thong tin do an:");
        for (DoAn d : doAn) {
            System.out.println(d.toString());
        }

        System.out.println("Thong tin ebook:");
        for (EDocument e : eBook) {
            System.out.println(e.toString());
        }
    }
}
