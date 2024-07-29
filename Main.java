package p1;

import java.util.Scanner;

public class Main {
    private static StudentManagementSystem sms = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    editStudent();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. Search Student");
        System.out.println("4. Display All Students");
        System.out.println("5. Edit Student");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        if (name.isEmpty() || rollNumber.isEmpty() || grade.isEmpty() || address.isEmpty()) {
            System.out.println("All fields are required.");
        } else {
            Student student = new Student(name, rollNumber, grade, address);
            sms.addStudent(student);
            System.out.println("Student added successfully.");
        }
    }

    private static void removeStudent() {
        System.out.print("Enter roll number of student to remove: ");
        String rollNumber = scanner.nextLine();
        sms.removeStudent(rollNumber);
        System.out.println("Student removed successfully.");
    }

    private static void searchStudent() {
        System.out.print("Enter roll number of student to search: ");
        String rollNumber = scanner.nextLine();
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayAllStudents() {
        sms.displayAllStudents();
    }

    private static void editStudent() {
        System.out.print("Enter roll number of student to edit: ");
        String rollNumber = scanner.nextLine();
        Student student = sms.searchStudent(rollNumber);
        if (student != null) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new grade: ");
            String newGrade = scanner.nextLine();
            System.out.print("Enter new address: ");
            String newAddress = scanner.nextLine();
            sms.editStudent(rollNumber, newName, newGrade, newAddress);
        } else {
            System.out.println("Student not found.");
        }
    }
}
