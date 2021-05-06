import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static BookRepository bookRepository;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        bookRepository = new BookRepository();
        while (true) {
            Menu.choose();
            System.out.print("Nhap lua chon: ");
            int choose = Integer.valueOf(sc.nextLine());
            switch (choose) {
               case 0:
                System.exit(0);
                break;

            case 1:
                bookRepository.getListBook();
                break;

            case 2:
                Menu.chooseCategory();
                System.out.print("Lua chon: ");
                int chooseCategory = sc.nextInt();
                getListByCategory(chooseCategory);
                break;

            case 3:
                System.out.print("Nhap ten tac gia muon tim: ");
                String arthorName = sc.nextLine();
                bookRepository.getBookByArthor(arthorName);
                break;

            case 4:
                System.out.print("Nhap ten sach muon tim: ");
                String bookName = sc.nextLine();
                bookRepository.search(bookName);
                break;
            case 5:
                Menu.chooseCategory();
                System.out.print("Lua chon: ");
                chooseCategory = sc.nextInt();
                addBook(chooseCategory);
                break;

            case 6:
                System.out.print("Nhap ten sach muon sua: ");
                bookName = sc.nextLine();
                bookRepository.edit(bookName);
                break;

            case 7:
                System.out.print("Nhap ten sach muon xoa: ");
                bookName = sc.nextLine();
                bookRepository.edit(bookName);
                break;
            }
        }
    }     
           
        

    public static void getListByCategory(int choose) {
        switch (choose) {
            case 1:
                bookRepository.getBookByCategory(Category.REFERENCE);
                bookRepository.getListByCategory();
                break;

            case 2:
                bookRepository.getBookByCategory(Category.LITERATURE);
                bookRepository.getListByCategory();
                break;

            case 3:
                bookRepository.getBookByCategory(Category.COMIC);
                bookRepository.getListByCategory();
                break;

            case 4:
                bookRepository.getBookByCategory(Category.LANGUAGE);
                bookRepository.getListByCategory();
                break;

            case 5:
                bookRepository.getBookByCategory(Category.ECONOMIC);
                bookRepository.getListByCategory();
                break;
        }
    }
    
    public static void addBook(int choose) {
        switch (choose) {
            case 1:
                bookRepository.add(Category.REFERENCE);
                break;
        
            case 2:
                bookRepository.add(Category.LITERATURE);
                break;

            case 3:
                bookRepository.add(Category.COMIC);
                break;

            case 4:
                bookRepository.add(Category.LANGUAGE);
                break;

            case 5:
                bookRepository.add(Category.ECONOMIC);
                break;
        }
    }
}
