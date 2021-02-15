package stalls;

import behaviours.ISecurity;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor10;
    Visitor visitor20;


    @Before
    public void setUp() throws Exception {
        visitor10 = new Visitor(10, 120, 10);
        visitor20 = new Visitor(20, 220, 10);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allows20YearOld() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor20));
    }

    @Test
    public void doesNotAllow10YearOld() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor10));
    }
}
