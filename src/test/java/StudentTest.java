import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {


//    @Test
//    public void testForStudentId(){
////        Student student1 = new Student();
//        assertEquals(0, Student.getId(), 0);
//        Student.setId(125);
//        assertEquals(125, Student.getId(), 0);
//    }

//
//    @Test
//    public void testForStudentName(){
//        assertNull(null, Student.getName());
//        Student.setName("David");
//        assertEquals("David", Student.getName());
//    }
////
//    @Test
//    public void testForGrades(){
//        ArrayList<Integer> grades = new ArrayList<>();
//        Student student = new Student(0, null, null);
//        grades.add(85);
//        assertEquals(1, grades.size());
//    }

    //    Instructor example
    private Student stud;

    @Before
    public void setUp() {
        this.stud = new Student(1, "David C");
    }

    @Test
    public void testStudentConstructor() {

        assertEquals(1, stud.getId());
        assertEquals("David C", stud.getName());
        assertTrue(stud.getGrades().isEmpty());
    }

    @Test
    public void testGetId() {
        assertEquals(1, stud.getId());
        Student craig = new Student(27, "Creepy Craig");
        assertEquals(27, craig.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("David C", stud.getName());
        Student bob = new Student(125, "Bob Bobberson");
        assertEquals("Bob Bobberson", bob.getName());
    }

    @Test
    public void addGrade() {
        stud.addGrade(85);
        stud.addGrade(72);
        stud.addGrade(91);

        assertEquals(3, stud.getGrades().size());
        stud.addGrade(100);
        assertEquals(4, stud.getGrades().size());
        Student bob = new Student(125, "Bob Bobberson");
        bob.addGrade(95);
        assertEquals(1, bob.getGrades().size());
    }

    @Test
    public void getGrades(){
//        the changes made inside of addGrade test does not affect what is inside of getGrades - like block scope
        assertEquals(0, stud.getGrades().size());
        stud.addGrade(55);
        assertEquals(1, stud.getGrades().size());
    }

    @Test
    public void testGetGradeAverage(){
        stud.addGrade(75);
        stud.addGrade(25);
        stud.addGrade(50);

        assertEquals(50, stud.getGradeAverage(), 0);
        stud.addGrade(10);
        assertEquals(40, stud.getGradeAverage(), 0);
    }

}
