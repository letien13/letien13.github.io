import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRepository {
    List<Book> listBook;
    List<Book> listByCategory;
    static String MYFILE = "BookList.txt";

    public BookRepository() {
        listBook = new ArrayList<Book>();
        File myFile = new File(MYFILE);

        try {
            Scanner fileReader = new Scanner(myFile);
            while (fileReader.hasNextLine()) {
                String s = fileReader.nextLine();
                String[] str = s.split(" - ");
                String bookId = str[0];
                String bookName = str[1];
                String arthor = str[2];
                String publisher = str[3];
                int publicYear = Integer.parseInt(str[4]);
                int borrowedTime = Integer.parseInt(str[5]);
                int borrowing = Integer.parseInt(str[6]);
                int inStock = Integer.parseInt(str[7]);
                String category = str[8];

                listBook.add(new Book(bookId, bookName, arthor, publisher, publicYear, borrowedTime, borrowing, inStock, category));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    
    }

    public void getListBook() {
        System.out.println("Danh sách sách trong thư viện:");
        listBook.forEach(System.out::println);
    }

    public List<Book> getBookByCategory(String category) {
        listByCategory = new ArrayList<Book>();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getCategory().equalsIgnoreCase(category)) {
                listByCategory.add(listBook.get(i));
            }
        }
        return listByCategory;
    }

    public void getListByCategory() {
        listByCategory.forEach(System.out::println);
    }

    public void getBookByArthor(String arthor) {
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getArthor().contains(arthor)) {
                System.out.println(listBook.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Khong có sách của tác giả này." : "");
    }
    
    public void search(String name) {
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookName().contains(name)) {
                System.out.println(listBook.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có sách cần tìm." : "");
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập mã sách: ");
            String bookId = sc.nextLine();
            System.out.print("Nhập tên sách: ");
            String bookName = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String arthor = sc.nextLine();
            System.out.print("Nhập nhà xuất bản: ");
            String publisher = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int publicYear = Integer.valueOf(sc.nextLine());
            System.out.print("Nhập số lần mượn: ");
            int borrowedTime = Integer.valueOf(sc.nextLine());
            System.out.print("Nhập số lượng đang mượn: ");
            int borrowing = Integer.valueOf(sc.nextLine());
            System.out.print("Nhập số lượng còn lại: ");
            int inStock = Integer.valueOf(sc.nextLine());
            System.out.print("Nhập thể loại: ");
            String category = sc.nextLine();
            listBook.add(new Book(bookId, bookName, arthor, publisher, publicYear, borrowedTime, borrowing, inStock, category));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Danh sách sau khi thêm: ");
        listBook.forEach(System.out::println);
        writeFile();
    }

    public void edit(String id) {
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookId().contains(id)) {
                System.out.println(listBook.get(i).toString());
                Scanner sc = new Scanner(System.in);
                try {
                    System.out.print("Nhập mã sách: ");
                    String bookId = sc.nextLine();
                    listBook.get(i).setBookId(bookId);
                    System.out.print("Nhập tên sách: ");
                    String bookName = sc.nextLine();
                    listBook.get(i).setBookName(bookName);
                    System.out.print("Nhập tác giả: ");
                    String arthor = sc.nextLine();
                    listBook.get(i).setArthor(arthor);
                    System.out.print("Nhập nhà xuất bản: ");
                    String publisher = sc.nextLine();
                    listBook.get(i).setPublisher(publisher);
                    System.out.print("Nhập năm xuất bản: ");
                    int publicYear = Integer.valueOf(sc.nextLine());
                    listBook.get(i).setPublicYear(publicYear);
                    System.out.print("Nhập số lần mượn: ");
                    int borrowedTime = Integer.valueOf(sc.nextLine());
                    listBook.get(i).setBorrowedTime(borrowedTime);
                    System.out.print("Nhập số lượng đang mượn: ");
                    int borrowing = Integer.valueOf(sc.nextLine());
                    listBook.get(i).setBorrowing(borrowing);
                    System.out.print("Nhập số lượng còn lại: ");
                    int inStock = Integer.valueOf(sc.nextLine());
                    listBook.get(i).setInStock(inStock);
                    System.out.print("Nhập thể loại: ");
                    String category = sc.nextLine();
                    listBook.get(i).setCategory(category);
                    count++;
                    System.out.println("Danh sách sau khi sửa: ");
                    System.out.println(listBook.get(i).toString());
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy sách.");
        }
        writeFile();
    }

    public void delete(String name) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookId().contains(name)) {
                System.out.println(listBook.get(i).toString());
                listBook.remove(listBook.get(i));
            }
        }
        System.out.println("Danh sách sau khi xóa: ");
        listBook.forEach(System.out::println);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(MYFILE);
            for (Book book : listBook) {
                fileWriter.write(book.toString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
