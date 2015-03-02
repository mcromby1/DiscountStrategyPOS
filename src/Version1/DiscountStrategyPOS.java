package Version1;

import com.sun.javafx.css.CascadingStyle;

/**
 *
 * @author Matthew
 */
public class DiscountStrategyPOS {

    public static void main(String[] args) {
        CashRegister payBox = new CashRegister("E212");
        
        payBox.setCustID("A2234");
        payBox.addItem("A101", 1);
        payBox.addItem("C230", 5);
        payBox.addItem("B101", 2);
        
        payBox.endSale();
    
    }
    
}
