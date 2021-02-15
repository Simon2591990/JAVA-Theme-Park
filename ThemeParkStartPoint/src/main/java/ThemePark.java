import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark(ArrayList<IReviewed> attractionsAndStalls) {
        this.attractionsAndStalls = attractionsAndStalls;

    }

    public ArrayList<IReviewed> getAllReviewed() {
        return attractionsAndStalls;
    }
}
