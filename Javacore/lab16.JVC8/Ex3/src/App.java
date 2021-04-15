import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("MyFiles.txt");
        try {
            Scanner readFile = new Scanner(file);     
        } catch (Exception e) {
            System.out.println("Khong tim thay file");
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }
}
