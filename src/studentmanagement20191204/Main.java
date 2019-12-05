package studentmanagement20191204;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        StudentManager studentManager = new StudentManager(ls);
        Student s1 = new Student("SV001", "Sứt", 8.9f, "BD", 2);
        Student s2 = new Student("SV002", "Lem", 7.9f, "BD", 1);
        studentManager.addNewStudent(s1);
        studentManager.addNewStudent(s2);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    studentManager.printStudentList();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    studentManager.updateStudent();
                    break;
                case 4:
                    studentManager.sortStudentByName();
                    break;
                case 5:
                    System.out.println("Hẹn gặp lại!");
                    break;
                default:
                    printMenu();
            }
        } while (choice != 5);
    }
    
    public static void printMenu() {
        System.out.println("Quản lý sinh viên");
        System.out.println("Danh sách chức năng");
        System.out.println(""
                + "1. Hiển thị danh sách sinh viên\n"
                + "2. Thêm sinh viên mới\n"
                + "3. Cập nhật sinh viên theo mã\n"
                + "4. Sắp xếp sinh viên theo tên\n"
                + "5. Thoát");
        System.out.print("Chọn chức năng: ");
    }
}
