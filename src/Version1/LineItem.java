package Version1;

/**
 *
 * @author Matthew
 */
public class LineItem {

    private String productID;
    private int quantity;
    private final Product product;
    private final DataStorable dataBox = new CustomerAndProductInfoNotDataBaseStrategy();

    public LineItem(String productID, int quantity) {
        this.setProductID(productID);
        this.setQuantity(quantity);
        this.product = dataBox.getProductInfo(productID);
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        //if(productID.(productID))
        this.productID = productID;
    }

    public final double getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final void setDiscountQuantity() {
        product.setDiscountQuantity(quantity);
    }

    public final String getProductDescription() {
        return product.getProdDescription();
    }

    public final double getProductPrice() {
        return product.getPrice();
    }

    public final double getProductDiscount() {
        return product.getDiscountAmount();
    }
}
