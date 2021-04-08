import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Chon so luong nhan vien muon nhap :");
        int n = sc.nextInt();
        NhanVien[] nhanvien = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap thong tin nhan vien thu %d \n", i + 1);
            System.out.print("Chon loai nhap vien (1 - Lap Trinh Vien; 2 - Kiem Chung Vien): ");
            int loai = sc.nextInt();
            if (loai == 1) {
                nhanvien[i] = new LapTrinhVien();
            }

            if (loai == 2) {
                nhanvien[i] = new KiemChungVien();
            }

            nhanvien[i].input();
        }

        System.out.println("Thong tin nhan vien: ");
        for (int i = 0; i < nhanvien.length; i++) {
            nhanvien[i].display();
        }
    }
}
