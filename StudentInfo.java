// CONSTRUCTOR OVERLOADING SIMPLE PROBLEM/PRACRTICE

class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber , double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    Student(int rollNumber){
        name = "not provided";
        this.rollNumber = rollNumber;
        marks = 0.0;
    }

    void showDetails(){
        if (!name.equals("not provided")){
            System.out.println("Name is :" + name);
        }
        else{
            
        }
        System.out.println("Roll Number : " + rollNumber);

        if (marks <= 0.0){
            System.out.println();
        }
        else{
            System.out.println("Marks is: " + marks);
        }
        
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        
        Student s1= new Student("Masood" , 101 ,85.5);
        Student s2 = new Student(102);

        s1.showDetails();
        System.out.println("\n-------\n");
        s2.showDetails();
    }
}
