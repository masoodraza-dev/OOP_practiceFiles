public class Main {
    public static void main(String[] args) {

        // Step 1: Ek Course object banao aur usme Semester 1 set karo
        Course sem1 = new Course();
        sem1.sem1();

        // Step 2: Student objects banao aur unhe sem1 course do
        Student s1 = new Student("Masood", "B24110006065", sem1);
        Student s2 = new Student("Luqman", "B24110006070", sem1);

        // Step 3: Student_List banao aur students add karo
        StudentList list = new StudentList();
        list.addStudent(s1);
        list.addStudent(s2);

        // Step 4: Saare students display karo
        System.out.println("----- All Students -----");
        list.displayStudents();

        // Step 5: Search student by roll number
        System.out.println("\n----- Search Student -----");
        Student found = list.searchByRollNum("B24110006065");
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found!");
        }

        // Step 6: Remove student
        System.out.println("\n----- Remove Student -----");
        list.removeStudent(s2);

        // Step 7: Final list display
        System.out.println("\n----- Final List After Removal -----");
        list.displayStudents();
    }
}
