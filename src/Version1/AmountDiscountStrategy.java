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
public class AmountDiscountStrategy implements Discountable{
    private double discountAmount;
    private double quantity;

    public AmountDiscountStrategy(double discountAmount) {
        this.setDiscountAmount(discountAmount);
    }

    public final double getDiscountAmount() {
        return discountAmount;
    }

    public final void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public void setQuantity(int quantity) {
    this.quantity = quantity;
    }
        
    @Override
    public final double getDiscount() {
    return discountAmount;
            }
       
}
