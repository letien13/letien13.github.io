import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("HH:mm  dd/MM/yyyy");
        String formattedDateTime = currentDateTime.format(formatObj);  
        System.out.println(formattedDateTime);
    }
}
