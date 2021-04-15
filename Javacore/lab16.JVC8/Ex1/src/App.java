import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap a: ");
            int a = sc.nextInt();

            System.out.println("Nhap b: ");
            int b = sc.nextInt();

            int c = b / a;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.println("Ko");
        }
        
    }
}
