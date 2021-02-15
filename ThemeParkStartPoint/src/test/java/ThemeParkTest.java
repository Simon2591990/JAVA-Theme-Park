import attractions.Dodgems;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    CandyflossStall candyflossStall;
    ArrayList<IReviewed> attractionsAndStalls;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems",8);
        candyflossStall = new CandyflossStall("Candy Floss","Simon", ParkingSpot.A1);
        attractionsAndStalls = new ArrayList<>();
        attractionsAndStalls.add(dodgems);
        attractionsAndStalls.add(candyflossStall);
        themePark = new ThemePark(attractionsAndStalls);
    }

    @Test
    public void hasListOfAttractionsAndStalls() {
        assertEquals(2, themePark.getAllReviewed().size());
    }
}
