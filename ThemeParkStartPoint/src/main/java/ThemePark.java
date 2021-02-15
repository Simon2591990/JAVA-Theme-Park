import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
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

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.getVisitedAttractions().add(attraction);
        attraction.increaseVisitCount();
    }
}
