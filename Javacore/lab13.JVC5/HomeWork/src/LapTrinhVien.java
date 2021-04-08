public class LapTrinhVien extends NhanVien {
    private int overTime;


    public LapTrinhVien(String name, String email, long phoneNumber, long basicSalary, int id, int age, int overTime,
            long salary) {
        super(name, email, phoneNumber, basicSalary, id, age);
        this.overTime = overTime;
        this.salary = salary;
    }

    public LapTrinhVien(int overTime, long salary) {
        this.overTime = overTime;
        this.salary = salary;
    }

    public LapTrinhVien() {
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }
    
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so gio overtime: ");
        overTime = sc.nextInt();
    }

    @Override
    public void salaryCalculator() {
        // TODO Auto-generated method stub
        super.salaryCalculator();
        this.salary = this.basicSalary + this.overTime * 200000;
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So gio overtime: " + overTime);
        System.out.println("Luong: "+ this.salary);
    }
    
}
