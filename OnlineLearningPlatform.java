/* Question: Online Learning Platform System
You're developing a system for an online learning platform.
 The platform has different types of users: Students, Teachers, and Admins.
  Each user can perform their specific action.
  
  more details about question given in OnlineLearningPlatform.txt
  */

abstract class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    abstract void performAction();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

interface FeedbackGiver {
    void giveFeedback();
}

class Student extends User implements FeedbackGiver {
    String courseEnrolled;

    Student(String name, String email, String courseEnrolled) {
        super(name, email);
        this.courseEnrolled = courseEnrolled;
    }

    @Override
    void performAction() {
        displayInfo();
        System.out.println("Enrolled in course: " + courseEnrolled);
        System.out.println("Action: Watching lectures");
    }

    @Override
    public void giveFeedback() {
        System.out.println("Feedback: We Loved the video lectures!\n");
    }
}

class Teacher extends User implements FeedbackGiver {
    String subjectTaught;

    Teacher(String name, String email, String subjectTaught) {
        super(name, email);
        this.subjectTaught = subjectTaught;
    }

    @Override
    void performAction() {
        displayInfo();
        System.out.println("Teaching subject: " + subjectTaught);
        System.out.println("Action: Uploading lectures");
    }

    @Override
    public void giveFeedback() {
        System.out.println("Feedback: Need better tools for lecture upload.\n");
    }
}

class Admin extends User {
    int adminLevel;

    Admin(String name, String email, int adminLevel) {
        super(name, email);
        this.adminLevel = adminLevel;
    }

    @Override
    void performAction() {
        displayInfo();
        System.out.println("Admin Level: " + adminLevel);
        System.out.println("Action: Managing the platform\n");
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        User[] users = new User[5];

        users[0] = new Student("Masood Raza", "masoodr508@gmail.com", "Java Programming");
        users[1] = new Student("Hassan Abbas", "hassanabbasshanbani110@gmail.com", "Web Development");

        users[2] = new Teacher("Miss Humera", "humera101@gmail.com", "Java");
        users[3] = new Teacher("Mr. Badar Sami", "badarsami786@gmail.com", "Data Structures");

        users[4] = new Admin("Admin Block", "admin@ku.com", 1);

        for (User u : users) {
            u.performAction();

            if (u instanceof FeedbackGiver) {
                FeedbackGiver fg = (FeedbackGiver) u;
                fg.giveFeedback();
            } else {
                System.out.println();
            }

            System.out.println("------------------------------------");
        }
    }
}

