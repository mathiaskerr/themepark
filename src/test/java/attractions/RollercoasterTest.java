package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(10,150.00,50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void isVisitorOldAndTallEnough(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void checkHasRating(){
        assertEquals(10,rollerCoaster.getRating());
    }
    @Test
    public void getPrice(){
        assertEquals(8.40,rollerCoaster.priceFor(visitor),0.00);
    }
}
