package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(18, 210, 20);
        visitor1 = new Visitor(10, 120, 10);
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
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void hasDoublePriceForTallVisitors() {
        assertEquals(16.80, rollerCoaster.priceForCustomer(visitor), 0.01);
    }

    @Test
    public void allowsVisitorsOver145Height() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void doesNotAllowVisitorsUnder145Height() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
