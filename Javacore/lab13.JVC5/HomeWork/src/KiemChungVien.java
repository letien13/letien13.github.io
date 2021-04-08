public class KiemChungVien extends NhanVien {
    private int soLoi;

    public KiemChungVien(String name, String email, long phoneNumber, long basicSalary, int id, int age, int soLoi,
            long salary) {
        super(name, email, phoneNumber, basicSalary, id, age);
        this.soLoi = soLoi;
        this.salary = salary;
    }
    public KiemChungVien(int soLoi, long salary) {
        this.soLoi = soLoi;
        this.salary = salary;
    }
    public KiemChungVien() {
    }
    public int getSoLoi() {
        return soLoi;
    }
    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
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
        System.out.print("So loi phat hien duoc: ");
        soLoi = sc.nextInt();
    }

   @Override
   public void salaryCalculator() {
       // TODO Auto-generated method stub
       super.salaryCalculator();
        this.salary = this.basicSalary + this.soLoi * 50000;

   }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So loi phat hien duoc: " + soLoi);
        System.out.println("Luong: " + this.salary);
    }

}
