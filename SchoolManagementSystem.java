class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;
    String grade;

    Student(String name, int age, String studentId, String grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");
    }
}

class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------");
    }
}

class Course {
    String courseName;
    Teacher teacher;
    Student[] students;

    Course(String courseName, Teacher teacher, Student[] students) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = students;
    }

    void showCourseDetails() {
        System.out.println(" Course: " + courseName);
        System.out.println("Teacher Info:");
        teacher.showInfo();

        System.out.println("Student Info:");
        for (Student s : students) {
            s.showInfo();
        }
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Ali", 40, "Math", 80000);

        Student s1 = new Student("Masood", 18, "S101", "A");
        Student s2 = new Student("Hassan", 19, "S102", "B+");
        Student s3 = new Student("Kainat", 20, "S103", "A+");

        Student[] students = { s1, s2, s3 };

        Course c1 = new Course("Algebra 101", t1, students);

        c1.showCourseDetails();
    }
}
