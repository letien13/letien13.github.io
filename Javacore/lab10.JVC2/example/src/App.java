import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.print("ilove");
        System.out.println("meimei");

        System.out.printf("%d", 1);
        
        String string = "Học lập trình là một hạnh phúc"; 
        System.out.printf("%S\n", string);

        int x = 666;
        double y = 33.99;
        System.out.printf("%d\t%.3f\n", x, y);

        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("%td/%1$tm%n", date);
        System.out.printf("H : %tH, M: %tM, S: %tS%n", date, date, date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);

        int a = 3, b = 4;
        double c =  Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Cạnh huyền của tam giác vuông bằng: " + c);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.print("Nhap chieu cao: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * 2);
        if (bmi < 18.5) {System.out.printf("Chi so BMI: %.1f: Thieu can \n", bmi);
            
        } else if (bmi > 24.9) {System.out.printf("Chi so BMI: %.1f: Thua can \n", bmi);
            
        } else {
            System.out.printf("Chi so BMI: %.1f: Can doi \n", bmi);

        }
        
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);

            }
        }
        
        int j;
        System.out.print("Nhap thang: ");
        j = sc.nextInt();
        switch (j) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("So ngay: 31");
                break;
            case 2:
                System.out.println("So ngay: 28 hoac 29");
                break;
            case 4, 6, 9, 11:
                System.out.println("So ngay: 30");
                break;
            default:
                System.out.println("Thang khong hop le");
                break;
        }

    }
}
