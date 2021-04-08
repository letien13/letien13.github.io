import java.util.Scanner;

public class NhanVien {
    private String name, email;
    private long phoneNumber;
    protected long basicSalary, salary;
    private int id, age;
    Scanner sc = new Scanner(System.in);

    public NhanVien(String name, String email, long 
    phoneNumber, long basicSalary,long salary, int id, int age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.basicSalary = basicSalary;
        this.salary = salary;
        this.id = id;
        this.age = age;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.print("Nhap ma nhan vien: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so dien thoai: ");
        phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = sc.nextLong();
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + age);
        System.out.println(phoneNumber + " - " + email);
        System.out.println("Luong co ban: " + basicSalary);
    }
    
    public void salaryCalculator() {
    }

   
}
