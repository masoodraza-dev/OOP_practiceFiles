public class StudentList {
    private Student[] list;
    private int size;      
    private int capacity;   

    public StudentList() {
        this.capacity = 4;   
        this.list = new Student[capacity];
        this.size = 0;
    }

 
    private void increaseCapacity() {
        if (size >= capacity) {
            capacity *= 2;
            Student[] newList = new Student[capacity];
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
    }

    public void addStudent(Student s) {
        increaseCapacity();
        list[size++] = s;
        System.out.println("Student added successfully!");
    }

    //remove student method
    public void removeStudent(Student s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (list[i].equals(s)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                list[i] = list[i + 1]; // shift elements left
            }
            list[size - 1] = null;
            size--;
            System.out.println("Student removed!");
        } else {
            System.out.println("Student not found in the list.");
        }
    }

    // Search by name
    public int searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (list[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Search by Roll Number
    public Student searchByRollNum(String id) {
        for (int i = 0; i < size; i++) {
            if (list[i].getRollNum().equalsIgnoreCase(id)) {
                return list[i];
            }
        }
        return null;
    }

    // Display students
    public void displayStudents() {
        if (size == 0) {
            System.out.println("No students in the list.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
