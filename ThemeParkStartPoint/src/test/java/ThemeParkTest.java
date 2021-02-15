import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    CandyflossStall candyflossStall;
    ArrayList<IReviewed> attractionsAndStalls;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems",8);
        candyflossStall = new CandyflossStall("Candy Floss","Simon", ParkingSpot.A1);
        attractionsAndStalls = new ArrayList<>();
        attractionsAndStalls.add(dodgems);
        attractionsAndStalls.add(candyflossStall);
        themePark = new ThemePark(attractionsAndStalls);
        visitor = new Visitor(20,200,30);
    }

    @Test
    public void hasListOfAttractionsAndStalls() {
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void VisitorCanVisitAttraction() {
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions().size());
        
    }
}
