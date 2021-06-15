import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void compareStrings() {
        String string1 = "Codeup";
        String string2 = "CodeUp";

//        assertEquals(string1, string2);
        assertNotEquals(string1, string2);
    }

    @Test
    public void compareArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void compareArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void compareStatements(){
        String language = "PHP";
//        assertFalse(language.contains("H"));
        assertTrue(language.contains("H"));

        assertFalse(language.contains("J"));
//        assertTrue(language.contains("J"));

    }
}
