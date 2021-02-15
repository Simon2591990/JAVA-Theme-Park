package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
    public double defaultPrice() {
        return 8.40;
    }

    public double priceForCustomer(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() >= 145){
            return true;
        }
        return false;
    }
}
