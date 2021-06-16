import java.util.ArrayList;

public class Student {

//    private static long id;
//    private static String name;
//    private static ArrayList<Integer> grades;


//    public Student(long id, String name, ArrayList<Integer> grades) {
//        this.id = id;
//        this.name = name;
//        this.grades = new ArrayList<>();
//    }
//
//    public static long getId() {
//        return id;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public static ArrayList<Integer> getGrades() {
//        return grades;
//    }
//
//    public static void setId(long id) {
//        Student.id = id;
//    }
//
//    public static void setName(String name) {
//        Student.name = name;
//    }
//
//    public static void setGrades(ArrayList<Integer> grades) {
//        Student.grades = grades;
//    }


//    instructor example
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum / grades.size();
    }


}
