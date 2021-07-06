public class App {
  public static void main(String[] args) {
    // Lọc người từ độ tuổi 20 -> 30
    DemoStream.filterAge(20, 30);

    // Tuổi trung bình của tất cả mọi người
    DemoStream.averageAge();

    // Tuổi trung bình theo từng quốc tịch
    DemoStream.averageAgeByNation();
  }
}