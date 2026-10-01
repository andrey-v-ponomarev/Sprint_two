package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DEFAULT_DISCOUNT;

public class Apple extends Food implements Discountable {

    private final String colour;

    public Apple(int amount, double price, String colour) {

        super(amount, price, true);

        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED) ? DEFAULT_DISCOUNT : 0;
    }
}