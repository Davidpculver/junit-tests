import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testForStudentId(){
        assertEquals(0, Student.id, 0);
        Student.id = 125;
        assertEquals(125, Student.id, 0);
    }

    @Test
    public void testForStudentName(){
        assertEquals(null, Student.name);
        Student.name = "David";
        assertEquals("David", Student.name);
    }

    @Test
    public void testForGrades(){
        assertEquals(null, Student.grades.get(0));
        grades.add(85);
        assertEquals(1, grades.size());
    }



}
