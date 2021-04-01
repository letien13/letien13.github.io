import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            a[i] = sc.nextInt();
        }

        // Tim phan tu lon nhat
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang: " + a[0]);

        // Tim phan tu be nhat 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Phan tu nho nhat trong mang: " + a[0]);

        // Liet ke cac so nguyen to + tinh tong
        int sum = 0;
        System.out.println("Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++) {
            if (isChecked(a[i])) {
                sum += a[i];
                System.out.println(a[i]);
            }
        }
        System.out.println("Tong cac so nguyen to: " + sum);

        // Nhap va sua phan tu tai vi tri k
        int k, valuek;
        System.out.print("Nhap vi tri k: ");
        k = sc.nextInt();
        System.out.print("Nhap gia tri a[k]: ");
        valuek = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == k) {
                a[i] = valuek;
            }
        }
        System.out.println("Mang a: ");
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
        
        sc.close();
    }
    
    public static boolean isChecked(int n) {
        if (n < 2) {
            return false;
        }
        double squareRoot = Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
