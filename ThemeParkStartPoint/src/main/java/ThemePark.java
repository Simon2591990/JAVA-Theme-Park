import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.HashMap;

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
    public HashMap viewReviews(){
        HashMap<String, Integer> reviews = new HashMap<String, Integer>();
        for(IReviewed attrastall : this.attractionsAndStalls){
            reviews.put(attrastall.getName(), attrastall.getRating());
        }
        return reviews;
    }
    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
        ArrayList<IReviewed> allowed = new ArrayList<>();
        for (IReviewed attrastall : this.attractionsAndStalls) {
            if (attrastall.isAllowedTo(visitor) == true) {
                allowed.add(attrastall);
            }
        }
        return allowed;
    }
}
