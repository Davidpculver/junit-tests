import org.junit.*;
import static org.junit.Assert.*;

public class KitchenTest {
    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testAdd(){
        assertTrue(emptyKitchen.isEmpty());
        emptyKitchen.add("Pizza crust");
        assertFalse(emptyKitchen.isEmpty());
        assertEquals(1, emptyKitchen.size());
        assertTrue(emptyKitchen.contains("Pizza crust"));
    }



}
