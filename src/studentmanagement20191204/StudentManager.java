package studentmanagement20191204;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> studentList;

    public StudentManager(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> addNewStudent(Student student) {
        this.studentList.add(student);
        return this.studentList;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Thêm mới sinh viên");
        System.out.print("Nhập vào mã sinh viên: ");
        String id = sc.nextLine();
        student.setId(id);
        System.out.print("Nhập vào tên sinh viên: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Nhập vào điểm trung bình");
        float gpa = sc.nextFloat();
        sc.nextLine();
        student.setGpa(gpa);
        System.out.print("Nhập vào giới tính: ");
        String gender = sc.nextLine();
        student.setGender(gender);
        System.out.print("Nhập vào tuổi: ");
        int old = sc.nextInt();
        sc.nextLine();
        student.setOld(old);
        studentList.add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cập nhật sinh viên theo mã");
        System.out.print("Nhập vào mã sinh viên:");
        String id = sc.nextLine();
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId().equals(id)) {
                isExisted = true;
                System.out.print("Nhập vào tên sinh viên: ");
                String name = sc.nextLine();
                studentList.get(i).setName(name);
                System.out.print("Nhập vào điểm trung bình");
                float gpa = sc.nextFloat();
                sc.nextLine();
                studentList.get(i).setGpa(gpa);
                System.out.print("Nhập vào giới tính: ");
                String gender = sc.nextLine();
                studentList.get(i).setGender(gender);
                System.out.print("Nhập vào tuổi: ");
                int old = sc.nextInt();
                sc.nextLine();
                studentList.get(i).setOld(old);
            }
        }
        if (!isExisted) {
            System.out.println("Sinh viên " + id + " không tồn tại!");
        } else {
            System.out.println("Cập nhật sinh viên " + id + " thành công!");
        }
    }
    
    public void sortStudentByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printStudentList();
    }

    public void printStudentList() {
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-9s%-15s%-5s%-9s%-5s", "Mã SV", "Tên SV", "Điểm TB", "Gender", "Tuổi");
        System.out.println("");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}
