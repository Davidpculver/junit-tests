import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student stud;
    private Student jenn;
    private Student richard;


    @Before
    public void setUp() {
        this.cohort = new Cohort();
        this.stud = new Student(2, "Stud Studly");
        this.jenn = new Student(12, "Jenn H");
        this.richard = new Student(7, "Richard Petty");
        stud.addGrade(50);
        stud.addGrade(75);
        stud.addGrade(25);
        jenn.addGrade(100);
        jenn.addGrade(100);
        jenn.addGrade(100);
    }

    @Test
    public void testAddStudent() {
        Cohort cohort = new Cohort();
        cohort.addStudent(richard);
        assertEquals(1, cohort.getStudents().size());
//        Student stud = new Student(2, "Stud Studly");
        cohort.addStudent(stud);
        assertEquals(2, cohort.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        Cohort cohort = new Cohort();
        cohort.addStudent(richard);
        cohort.addStudent(richard);
        cohort.addStudent(richard);
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Richard Petty", cohort.getStudents().get(2).getName());
    }

    @Test

    public void testCohortAverage() {
        Cohort cohort = new Cohort();
//        Student stud = new Student(2, "Stud Studly");
        cohort.addStudent(stud);
//        moved to setup
//        stud.addGrade(50);
//        stud.addGrade(75);
//        stud.addGrade(25);
//        Student jenn = new Student(12, "Jenn H");
        cohort.addStudent(jenn);
//        moved to setup
//        jenn.addGrade(100);
//        jenn.addGrade(100);
//        jenn.addGrade(100);

        assertEquals(75, cohort.getCohortAverage(), 0);

    }

}
