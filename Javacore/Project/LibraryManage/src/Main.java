import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static BookRepository bookRepository;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        bookRepository = new BookRepository();

            Menu.chooseUser();
            System.out.print("Nhap lua chon: ");
            int user = sc.nextInt();
            switch (user) {
                case 1:
                    while (true) {
                        Menu.allUserChoose();
                        System.out.print("Lua chon: ");
                        int choose = sc.nextInt();
                        sc.nextLine();
                        allUser(choose);
                    }

                case 2:
                    while (true) {
                        Menu.allUserChoose();
                        Menu.librarianChoose();
                        System.out.print("Lua chon: ");
                        int choose = sc.nextInt();
                        sc.nextLine();
                        allUser(choose);
                        switch (choose) {
                            case 4:
                                Menu.chooseCategory();
                                System.out.print("Lua chon: ");
                                int chooseCategory = sc.nextInt();
                                addBook(chooseCategory);
                                break;

                            case 5:
                                System.out.print("Nhap ten sach muon sua: ");
                                String bookName = sc.nextLine();
                                bookRepository.edit(bookName);
                                break;

                            case 6:
                                System.out.print("Nhap ten sach muon xoa: ");
                                bookName = sc.nextLine();
                                bookRepository.edit(bookName);
                                break;
                        }
                    }
            }
            sc.close();
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
    
    public static void allUser(int choose) {
        Scanner sc = new Scanner(System.in);
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Menu.chooseCategory();
                System.out.print("Lua chon: ");
                int chooseCategory = sc.nextInt();
                getListByCategory(chooseCategory);
                break;

            case 2:
                System.out.print("Nhap ten tac gia muon tim: ");
                String arthorName = sc.nextLine();
                bookRepository.getBookByArthor(arthorName);
                break;

            case 3:
                System.out.print("Nhap ten sach muon tim: ");
                String bookName = sc.nextLine();
                bookRepository.search(bookName);
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
