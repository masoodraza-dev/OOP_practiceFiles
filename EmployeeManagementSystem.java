class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private static int empCount = 0;
    private final int employeeId;
    private String department;

    public Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        empCount++;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public static int getEmpCount() {
        return empCount;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int employeeId, String department, int teamSize) {
        super(name, age, employeeId, department);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Manager is managing a team of " + teamSize + " people");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String specialization;

    public Developer(String name, int age, int employeeId, String department, String specialization) {
        super(name, age, employeeId, department);
        this.specialization = specialization;
    }

    @Override
    public void work() {
        System.out.println("Developer is coding in " + specialization);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];

        staff[0] = new Manager("Masood Raza", 24, 101, "HR", 5);
        staff[1] = new Developer("Syed Azfar", 26, 102, "IT", "Backend");
        staff[2] = new Developer("Faisal Khan", 25, 103, "IT", "Frontend");
        staff[3] = new Manager("Ayesha Raza", 22, 104, "Sales", 3);

        System.out.println("---- Company Staff Details ----\n");
        for (Employee emp : staff) {
            emp.displayInfo();
            emp.work();
            System.out.println("------------------------");
        }

        System.out.println("Total Employees Created: " + Employee.getEmpCount());
    }
}
