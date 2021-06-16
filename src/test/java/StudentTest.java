import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {



    @Test
    public void testForStudentId(){
//        Student student1 = new Student();
        assertEquals(0, Student.id, 0);
        Student.id = 125;
        assertEquals(125, Student.id, 0);
    }

    @Test
    public void testForStudentName(){
        assertNull(null, Student.name);
        Student.name = "David";
        assertEquals("David", Student.name);
    }
//
    @Test
    public void testForGrades(){
        assertNull(null, Student.grades.get(0));
        grades.add(85);
        assertEquals(1, grades.size());
    }



}
