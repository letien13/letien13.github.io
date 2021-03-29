import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 3, b = 4;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Do dai canh huyen: %.0f \n", c);

        // System.out.print("Nhap can nang: ");
        // double weight = sc.nextDouble();
        // System.out.print("Nhap chieu cao: ");
        // double height = sc.nextDouble();
        // double bmi = weight / Math.pow(height, 2);
        // System.out.printf("Chi so BMI: %.1f - ", bmi);
        // if (bmi < 18.5) {
        //     System.out.println("Thieu can ");
        // } else {
        //     if (bmi > 24.9) {
        //         System.out.println("Thua can ");
        //     } else {
        //         System.out.println("Can doi ");
        //     }
        // }

        // System.out.print("Nhap thang bat ky: ");
        // int month = sc.nextInt();
        // switch (month) {
        //     case 1:
        //     case 3:
        //     case 5:
        //     case 7:
        //     case 8:
        //     case 10:
        //     case 12:
        //         System.out.println("Thang co 31 ngay");
        //         break;
        //     case 4:
        //     case 6:
        //     case 9:
        //     case 11:
        //         System.out.println("Thang co 30 ngay");
        //         break;
        //     case 2:
        //         System.out.println("Thang co 28 hoac 29 ngay");
        //         break;
        //     default:
        //         System.out.println("Thang khong hop le");
        //         break;
        // }

        // for (int i = 0; i <= 10; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        // for (int j = 1; j <= 100; j++) {
        //     if (j % 3 ==0) {
        //         System.out.println("Fizz");
        //     } else {
        //     if (j % 5 == 0) {
        //         System.out.println("Buzz");
        //     } else {
        //     if (j % 3 == 0) {
        //         if (j % 5 == 0) {
        //          System.out.println("FizzBuzz");
        //     } else {
        //          System.out.println(j);
        //                 }

        //             }
        //         }
        //     }
        // }

        // int k = 0;
        // while (k <= 10) {
        //     if (k % 2 == 0) {
        //         System.out.println(k + "\t");
        //     }
        //     k++;
        // }

            
        // System.out.println("Nhap so bat ky: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int h = 0; h <= n; h++) {
        //     if (h%2==0) {
        //         sum += h;
        //     }
        // }
        // System.out.println("Tong"+ sum);

        

        System.out.println("Nhap so bat ky: ");
        int m = sc.nextInt();
        boolean isChecked(l)=true;
        int count = 0;
        int l =2;
        while (count < m) {
            if (isChecked(l)) {
                System.out.println(l);
                count++;
            }
            l++;
        }
        public static boolean isChecked(int m) {
            if (m < 2) {
                return false;
            }
            for (int l = 2; l <= Math.sqrt(m); l++){
                if (m % l == 0) {
                    return false;
                }
            }
            return true;
        }  

    
    }
    
}
