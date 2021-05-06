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
                Category category = null;
                if (str[8].equalsIgnoreCase("Sach tham khao")) {
                    category = Category.REFERENCE;
                } else if (str[8].equalsIgnoreCase("Sach van hoc")) {
                    category = Category.LITERATURE;
                } else if (str[8].equalsIgnoreCase("Truyen tranh")) {
                    category = Category.COMIC;
                } else if (str[8].equalsIgnoreCase("Sach ngoai ngu")) {
                    category = Category.LANGUAGE;
                } else if (str[8].equalsIgnoreCase("Sach kinh te")) {
                    category = Category.ECONOMIC;
                }

                listBook.add(new Book(bookId, bookName, arthor, publisher, publicYear, borrowedTime, borrowing, inStock,
                        category));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Danh sach sach trong thu vien:");
        listBook.forEach(System.out::println);

    }

    public List<Book> getBookByCategory(Category category) {
        listByCategory = new ArrayList<Book>();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getCategory().equals(category)) {
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
        System.out.println((count == 0) ? "Khong co sach cua tac gia nay." : "");
    }
    
    public void search(String name) {
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookName().contains(name)) {
                System.out.println(listBook.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Khong co sach can tim." : "");
    }

    public void add(Category category) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String bookId = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String arthor = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String pulisher = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int publicYear = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap so lan muon: ");
        int borrowedTime = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap so luong dang muon: ");
        int borrowing = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap so luong con: ");
        int inStock = Integer.valueOf(sc.nextLine());
        sc.close();
    }

    public void edit(String name) {
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookName().contains(name)) {
                System.out.println(listBook.get(i).toString());
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap ma sach: ");
                String bookId = sc.nextLine();
                System.out.print("Nhap ten sach: ");
                String bookName = sc.nextLine();
                System.out.print("Nhap tac gia: ");
                String arthor = sc.nextLine();
                System.out.print("Nhap nha xuat ban: ");
                String pulisher = sc.nextLine();
                System.out.print("Nhap nam xuat ban: ");
                int publicYear = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap so lan muon: ");
                int borrowedTime = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap so luong dang muon: ");
                int borrowing = Integer.valueOf(sc.nextLine());
                System.out.print("Nhap so luong con: ");
                int inStock = Integer.valueOf(sc.nextLine());
                sc.close();
                count++;
                System.out.println("Sach sau khi sua: ");
                System.out.println(listBook.get(i).toString());
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay sach.");
        }
        writeFile();
    }

    public void delete(String name) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getBookName().contains(name)) {
                System.out.println(listBook.get(i).toString());
                listBook.remove(listBook.get(i));
            }
        }
        System.out.println("Danh sach sau khi xoa: ");
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
