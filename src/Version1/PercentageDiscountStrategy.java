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
public class PercentageDiscountStrategy implements Discountable{
    private double discountPercentage;
    private double discountQuantity;
    private double productPrice;

    public PercentageDiscountStrategy(double discountPercentage, double productPrice) {
        this.setDiscountPercentage(discountPercentage);
        this.setProductPrice(productPrice);
    }

    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public final double getDiscountQuantity() {
        return discountQuantity;
    }
    
    @Override
    public final void setQuantity(int discountQuantity) {
        this.discountQuantity = discountQuantity;
    }

    public final double getProductPrice() {
        return productPrice;
    }

    public final void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    @Override
    public final double getDiscount() {
    return discountPercentage * productPrice * discountQuantity;
    }
    
}
