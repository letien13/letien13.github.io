import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhap so phan tu cua mang A: ");
        n = sc.nextInt();
        while (n <= 0 || n >= 100) {
            System.out.println("So da nhap khong hop le !!!");
            System.out.print("Vui long nhap lai: ");
            n = sc.nextInt();
        }
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            A[i] = sc.nextInt();
        }
        
        // Tim phan tu lon nhat va lon thu 2
        int max1 = A[0];
        int vitri1 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > max1) {
                vitri1 = i;
                max1 = A[i];
            }
        }
        System.out.printf("Phan tu lon nhat la A[%d] = %d \n", vitri1, max1);
        
        int max2 = A[0];
        int vitri2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > max2 && max1 > A[i]) {
                vitri2 = i;
                max2 = A[i];
            }
        }
        System.out.printf("Phan tu lon thu 2 la A[%d] = %d \n", vitri2, max2);

        // Tim so nguyen to
        System.out.println("So nguyen to trong mang A: ");
        for (int i = 0; i < n; i++) {
            if (isPrimeNum(A[i])) {
                System.out.print(A[i] +" ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();

        // Tao mang B
        int m;
        System.out.print("Nhap so phan tu cua mang B: ");
        m = sc.nextInt();
        while (m <= 0 || m >= 100) {
            System.out.println("Vui long nhap lai: ");
            m = sc.nextInt();
        }
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.printf("Nhap phan tu thu %d: ", i);
            B[i] = sc.nextInt();
        }
        System.out.println("Mang B: ");
        for (int i = 0; i < m; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Phan giao cua mang A va B
        System.out.println("Phan giao cua A va B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] +" ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
    
    public static boolean isPrimeNum(int n) {
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
