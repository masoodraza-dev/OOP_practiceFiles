public class Student {
    private String name;
    private String rollNum;
    private Course course;

    public Student(String name, String rollNum, Course course){
        this.name = name;
        this.rollNum = rollNum;
        this.course =new Course(course);
        
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRollNum(String rollNum){
        this.rollNum = rollNum;
    }

    public void setCours(Course course){
        this.course = new Course(course);
    }

    public String getName(){
        return name;
    }

    public String getRollNum(){
        return rollNum;
    }

    public Course getCourse(){
        return new Course(course);
    }

    @Override
    public String toString(){
        return "Student{" + "name=" + name + '\'' +
            ", rollNum='" + rollNum + '\'' +
            ", courses=" + course +
            '}';
    }
    
}
