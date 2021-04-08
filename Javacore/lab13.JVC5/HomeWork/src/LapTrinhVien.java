public class LapTrinhVien extends NhanVien {
    private int overTime;

    public LapTrinhVien(String name, String email, long phoneNumber, long basicSalary, long salary, int id, int age) {
        super(name, email, phoneNumber, basicSalary, salary, id, age);
    }
    
    public LapTrinhVien(int overTime, long salary) {
        this.overTime = overTime;

    }

    public LapTrinhVien() {
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }
    

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so gio overtime: ");
        overTime = sc.nextInt();
    }

    @Override
    public int salaryCalculator() {
        // TODO Auto-generated method stub
        super.salaryCalculator();
        this.salary = this.basicSalary + this.overTime * 200000;
        return this.salary;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So gio overtime: " + overTime);
        System.out.println("Luong: "+ this.salary);
    }
    
}
