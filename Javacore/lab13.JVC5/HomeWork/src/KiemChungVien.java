public class KiemChungVien extends NhanVien {
    private int soLoi;

    public KiemChungVien(String name, String email, long phoneNumber, long basicSalary, long salary, int id, int age) {
        super(name, email, phoneNumber, basicSalary, salary, id, age);
    }
    public KiemChungVien(int soLoi, long salary) {
        this.soLoi = soLoi;
      
    }
    public KiemChungVien() {
    }
    public int getSoLoi() {
        return soLoi;
    }
    public void setSoLoi(int soLoi) {
        this.soLoi = soLoi;
    }
    

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("So loi phat hien duoc: ");
        soLoi = sc.nextInt();
    }

   @Override
   public long salaryCalculator() {
       // TODO Auto-generated method stub
       super.salaryCalculator();
        this.salary = this.basicSalary + this.soLoi * 50000;
        return this.salary;
   }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println("So loi phat hien duoc: " + soLoi);
        System.out.println("Luong: " + this.salary);
    }


}
