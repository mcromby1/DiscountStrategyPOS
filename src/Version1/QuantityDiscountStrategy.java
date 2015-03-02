/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Version1;

/**
 *
 * @author Matthew
 */
public class QuantityDiscountStrategy implements Discountable {

    private int quantity;
    private int minDiscountQuantity;
    private double discountAmount;

    public QuantityDiscountStrategy(int minDiscountQuantity, double discountAmount) {
        this.setMinDiscountQuantity(minDiscountQuantity);
        this.setDiscountAmount(discountAmount);
    }

    public final int getQuantity() {
        return quantity;
    }

    @Override
    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final int getMinDiscountQuantity() {
        return minDiscountQuantity;
    }

    public final void setMinDiscountQuantity(int minDiscountQuantity) {
        this.minDiscountQuantity = minDiscountQuantity;
    }

    public final double getDiscountAmount() {
        return discountAmount;
    }

    public final void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public final double getDiscount() {
        if (quantity >= minDiscountQuantity) {
            return discountAmount;
        } else {
            return 0;
        }
    }

}
