import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = "";
        boolean check = true;
        while (check) {
            try {
                System.out.println("Nhap so: ");
                n = sc.nextLine();
                if (n.equalsIgnoreCase("Q") || n.toUpperCase().equals("X")) {
                check = false;
                System.exit(0);
                }
                int m = Integer.parseInt(n);
                if (isPrime(m)) {
                System.out.println(m +" la so nguyen to");
                } else {
                System.out.println(m + " khong phai so nguyen to");
                }
            
        } catch (Exception e) {
            System.out.println(n + " khong phai la so");
        }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n >= 2) {
            double squareRoot = Math.sqrt(n);
            for (int i = 2; i < squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
        }
}
