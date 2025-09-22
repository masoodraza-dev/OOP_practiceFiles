public class Course {
    private String[] courseName = new String[6];
    private int[] courseCode = new int[6];

    public Course(){};

    public Course(Course c){
        this.courseName = c.courseName.clone();
        this.courseCode = c.courseCode.clone();
    }

    public void sem1(){
        courseName = new String[]{
            "ICT","Programming Fundamentals", "English", "Physics",
            "Calculus-1", "Islamic Learnings or Ethics"
        };

        courseCode = new int[]{301,302,303,304,305,306};
    }
    public void sem2(){
        courseName = new String[]{
            "oop","DLD","DS","L Algebra","Communication Skills","PSt"
        };
        courseCode = new int[]{401,402,403,404,405,406};
    }

    public String toString(){
        String result = "Semester 1 Course:\n";
        for (int i = 0; i<courseName.length; i++){
            result += courseCode[i] + " - " + courseName[i] + "\n";
        }
        return result;
    }

}
