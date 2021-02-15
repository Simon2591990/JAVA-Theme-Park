package behaviours;

import people.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceForCustomer(Visitor visitor);
}
