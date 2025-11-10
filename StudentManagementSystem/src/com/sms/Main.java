package com.sms;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student\n2. View Students\n3. Exit");
            System.out.println("Select from these three:");1
            int choice = sc.nextInt();
            sc.nextLine();
            

            switch (choice) {
                case 1 -> {
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Age: "); int age = sc.nextInt(); sc.nextLine();
                    System.out.print("Gender: "); String gender = sc.nextLine();
                    System.out.print("Course: "); String course = sc.nextLine();
                    dao.addStudent(new Student(name, age, gender, course));
                }
                case 2 -> {
                    List<Student> students = dao.getAllStudents();
                    for (Student s : students) {
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getAge() + " | " + s.getGender() + " | " + s.getCourse());
                    }
                }
                case 3 -> { System.out.println("Exiting..."); System.exit(0); }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
