import java.util.ArrayList;
public class StudentList {
    private ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student s){
        list.add(s);
        System.out.println("Student added succesfully:");
    }

    public void removeStudent(Student s){
       if ( list.remove(s)){
        System.out.println("Student removed:");}
        else{
            System.out.println("Student not found in the list");
        }
    }

    public int searchByName(String name){
        for (int i = 0 ; i < list.size() ; i++){
            Student s = list.get(i);

            if(s.getName().equalsIgnoreCase(name)){
                return i;
            }
        }

        return -1;
    }

    public Student searchByRollNum(String id){
        for (int i = 0 ; i<list.size(); i++){
            Student s =  list.get(i);

            if (s.getRollNum().equalsIgnoreCase(id)){
                return s;
            }
        }
        return null;
    }

    public void displayStudents() {
    if (list.isEmpty()) {
        System.out.println("No students in the list.");
        return;
    }

    for (Student s : list) {
        System.out.println(s);
    }
}

    
}
