import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course sem1 = new Course();
        sem1.sem1();

        StudentList list = new StudentList();

        boolean running = true;

        while (running) {
            System.out.println("\n===== Mini LMS Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Remove Student by Roll Number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    String roll = sc.nextLine();

                    Student s = new Student(name, roll, sem1);
                    list.addStudent(s);
                    break;

                case 2:
                    System.out.println("----- All Students -----");
                    list.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    String searchRoll = sc.nextLine();
                    Student found = list.searchByRollNum(searchRoll);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter roll number to remove: ");
                    String removeRoll = sc.nextLine();
                    Student removeStudent = list.searchByRollNum(removeRoll);
                    if (removeStudent != null) {
                        list.removeStudent(removeStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
