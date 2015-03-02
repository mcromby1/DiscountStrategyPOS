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
public class NoDiscountStrategy implements Discountable {

    @Override
    public final double getDiscount() {
        return 0;
    }

    @Override
    public final void setQuantity(int quantity) {
    }

}
