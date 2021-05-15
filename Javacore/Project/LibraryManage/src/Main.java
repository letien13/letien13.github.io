import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static BookRepository bookRepository;
    static MemberManage memberManage;
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(System.in);
        bookRepository = new BookRepository();
        memberManage = new MemberManage();

        while (true) {
            Menu.choose();
            System.out.print("Nhập lựa chọn: ");
            int choose = 0;
            boolean check = true;

            while (check) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose <0 || choose > 13) {
                        System.out.println("Lựa chọn không hợp lệ !!!");
                        System.out.println("Vui lòng nhập lại");
                        System.out.print("Nhập lựa chọn: ");
                    } else {
                        check = false;
                    }
                } catch (Exception e) {
                    System.out.println("Lựa chọn không hợp lệ !!!");
                    System.out.println("Vui lòng nhập lại");
                    System.out.print("Nhập lựa chọn: ");
                }
            }
            
            
            switch (choose) {
            case 0:
                System.exit(0);
                break;

            case 1:
                bookRepository.getListBook();
                System.out.println();
                break;

            case 2:
                Menu.chooseCategory();
                System.out.print("Nhập lựa chọn: ");
                int chooseCategory = sc.nextInt();
                sc.nextLine();
                getListByCategory(chooseCategory);
                System.out.println();
                break;

            case 3:
                System.out.print("Nhập tên tác giả muốn tìm: ");
                String arthorName = sc.nextLine();
                bookRepository.getBookByArthor(arthorName);
                System.out.println();
                break;

            case 4:
                System.out.print("Nhập tên sách muốn tìm: ");
                String bookName = sc.nextLine();
                bookRepository.search(bookName);
                System.out.println();
                break;

            case 5:
                bookRepository.add();
                System.out.println();
                break;

            case 6:
                System.out.print("Nhập mã sách muốn sửa: ");
                String bookId = sc.nextLine();
                bookRepository.edit(bookId);
                System.out.println();
                break;

            case 7:
                System.out.print("Nhập mã sách muốn xóa: ");
                bookId = sc.nextLine();
                bookRepository.delete(bookId);
                System.out.println();
                break;

            case 8:
                memberManage.getListMember();
                System.out.println();
                break;

            case 9:
                memberManage.checkDate();
                System.out.println();
                break;

            case 10:
                memberManage.addMember();
                System.out.println();
                break;

            case 11:
                System.out.print("Nhập mã số hội viên muốn sửa: ");
                String memberId = sc.nextLine();
                memberManage.editMember(memberId);
                System.out.println();
                break;

            case 12:
                System.out.print("Nhập mã số hội viên muốn xoá: ");
                memberId = sc.nextLine();
                memberManage.removeMember(memberId);
                System.out.println();
                break;
            }
        }
    }     
           
        

    public static void getListByCategory(int choose) {
        switch (choose) {
            case 1:
                String category1 = "Sách tham khảo";
                bookRepository.getBookByCategory(category1);
                bookRepository.getListByCategory();
                break;

            case 2:
                String category2 = "Sách văn học";
                bookRepository.getBookByCategory(category2);
                bookRepository.getListByCategory();
                break;

            case 3:
                String category3 = "Truyện tranh";
                bookRepository.getBookByCategory(category3);
                bookRepository.getListByCategory();
                break;

            case 4:
                String category4 = "Sách ngoại ngữ";
                bookRepository.getBookByCategory(category4);
                bookRepository.getListByCategory();
                break;

            case 5:
                String category5 = "Sách kinh tế";
                bookRepository.getBookByCategory(category5);
                bookRepository.getListByCategory();
                break;
        }
    }
    
    
}
