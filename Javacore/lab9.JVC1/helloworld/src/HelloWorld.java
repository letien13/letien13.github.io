import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // char a = 65;
        // System.out.println(a);

        // String str = "  Nyan  ";
        // System.out.println(str.trim());//xoa khoang trang
        // System.out.println(str);
        // System.out.println(str.toUpperCase());//viet hoa
        // System.out.println(str.toLowerCase());//viet thuong
        // System.out.println(str.length());//do dai cua chuoi

        // String s1 = "jav";
        // String s2 = "JAV";
        // String s3 = "CSS";
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equalsIgnoreCase(s2));

        




        // enum
        // Season{
        //     WINTER, SPRING, SUMMER, AUTUMN
        // }
        
        // Season season = Season.SPRING;
        // System.out.println(season);

        // //Lay ngay hien tai
        // LocalDate currentDate = LocalDate.now();
        // System.out.println(currentDate);

        // //Lay gio hien tai
        // LocalTime currenTime = LocalTime.now();
        // System.out.println(currenTime);

        // //Lay ngay gio hien tai
        // LocalDateTime currentDateTime = LocalDateTime.now();
        // System.out.println(currentDateTime);

        // //format date time
        // DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // String DateFormat = currentDate.format(dateTimeFormatter);
        // System.out.println(DateFormat);

        // final double PI = 3.14;
        // System.out.println(PI);

        // //ep kieu ngam dinh implicit
        // int d = 5;
        // long e = d;
        // float f = d;
        // System.out.println(e);
        // System.out.println(f);

        // // ep kieu tuong minh explicit
        // double h = 5.7;
        // int i = (int) h;
        // System.out.println(i);

        Scanner scanner = new Scanner(System.in);
        // int k;
        // k = scanner.nextInt();
        // System.out.println("k = " + k);
        
        String a;
        int b;
        String c;

        System.out.println("Nhap thong tin: ");
        
        System.out.println("Ten : " );
        a = scanner.nextLine();

        System.out.println("Tuoi : ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("Dia chi : " );
        c = scanner.nextLine();
        
        System.out.println("Ten: " + a);
        System.out.println("Tuoi: " + b);
        System.out.println("Dia chi: " + c);

        final int NUM;
        NUM = 6;
        System.out.println(NUM);


        


    
    }
}