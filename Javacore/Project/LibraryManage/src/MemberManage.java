import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberManage extends Member{
    List<Member> listMember;
    List<Member> listDate;
    static String MEMBERFILE = "MemberList.txt";

    public MemberManage() throws ParseException {
        listMember = new ArrayList<Member>();
        File memberFile = new File(MEMBERFILE);

        try {
            Scanner fileReader = new Scanner(memberFile);
            while (fileReader.hasNextLine()) {
                String sm = fileReader.nextLine();
                String[] strm = sm.split(" - ");
                String memberId = strm[0];
                String memberName = strm[1];
                String phone = strm[2];
                String borrowingBook = strm[3];
                Date returnDate = null;
                try {
                    returnDate = new SimpleDateFormat("dd/MM/yyyy").parse(strm[4]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                
                listMember.add(new Member(memberId, memberName, phone, borrowingBook, returnDate));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getListMember() {
        System.out.println("Danh sách hội viên:");
        listMember.forEach(System.out::println);
    }

    public void checkDate() {
        listDate = new ArrayList<Member>();
        Date date = new Date();
        for (int i = 0; i < listMember.size(); i++) {
            if (date.compareTo(listMember.get(i).getReturnDate()) >= 0) {
                listDate.add(listMember.get(i));
            }
        }
        listDate.forEach(System.out::println);
    }
    
    public void addMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hội viên: ");
        String memberId = sc.nextLine();
        System.out.print("Nhập tên: ");
        String memberName = sc.nextLine();
        System.out.print("Nhập SĐT: ");
        String phone = sc.nextLine();
        System.out.print("Nhập sách đang mượn: ");
        String borrowingBook = sc.nextLine();
        System.out.print("Nhập ngày trả: ");
        Date returnDate = inputDate();
        listMember.add(new Member(memberId, memberName, phone, borrowingBook, returnDate));
        listMember.forEach(System.out::println);
        writeFile();
    }

    public Date inputDate() {
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        try {
            returnDate = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return returnDate;
    }

    void editMember(String id) {
        int count = 0;
        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getMemberId().equalsIgnoreCase(id)) {
                System.out.println(listMember.get(i).toString());
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập mã hội viên: ");
                String memberId = sc.nextLine();
                listMember.get(i).setMemberId(memberId);
                System.out.print("Nhập tên: ");
                String memberName = sc.nextLine();
                listMember.get(i).setMemberName(memberName);
                System.out.print("Nhập SĐT: ");
                String phone = sc.nextLine();
                listMember.get(i).setPhone(phone);
                System.out.print("Nhập sách đang mượn: ");
                String borrowingBook = sc.nextLine();
                listMember.get(i).setBorrowingBook(borrowingBook);
                System.out.print("Nhập ngày trả: ");
                Date returnDate = inputDate();
                listMember.get(i).setReturnDate(returnDate);
                count++;
                System.out.println("Danh sách sau khi sửa:");
                listMember.forEach(System.out::println);
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy hội viên này");
        }
        writeFile();
    }

    public void removeMember(String id) {
        for (int i = 0; i < listMember.size(); i++) {
            if (listMember.get(i).getMemberId().equalsIgnoreCase(id)) {
                System.out.println(listMember.get(i).toString());
                listMember.remove(i);
            }
        }
        System.out.println("Danh sách sau khi xóa: ");
        listMember.forEach(System.out::println);
        writeFile();
    }

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter(MEMBERFILE);
            for (Member member : listMember) {
                fileWriter.write(member.toString() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
