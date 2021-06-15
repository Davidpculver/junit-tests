import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private String expected;

    @Before
    public void setUp(){
        this.expected = "Hello World!";
    }

//    can set annotation to have value. Can tell it what is expected. Since it is expected, this code passes
    @Test(expected = IllegalArgumentException.class)
    public void tesIfHelloWorldWorks(){
//        Moved expected to setUp method above.
//        String expected = "Hello World!";
//        String expectedDave = "Hello, Dave!";
//         test to compare what we expect and what is returned from the method
//          All test methods will be public void
//        assert methods able to return results from a method that has return
        assertEquals(this.expected, HelloWorld.hello());

        assertNotNull(HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello());
        assertNotEquals("Hello, null!", HelloWorld.hello(null));
    }


}
