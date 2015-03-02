package Version1;

public class Product {

    private String productID;
    private String prodDescription;
    private double price;
    private Discountable discount;

    public Product() {
    }
    
    public Product(String productID, String prodDescription, double price, Discountable discount) {
        this.productID = productID;
        this.prodDescription = prodDescription;
        this.price = price;
        this.discount = discount;
    }

    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getProdDescription() {
        return prodDescription;
    }

    public final void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final Discountable getDiscount() {
        return discount;
    }

    public final void setDiscount(Discountable discount) {
        this.discount = discount;
    }
    
    public final void setDiscountQuantity(int q){
        discount.setQuantity(q);
    }
    
    public final double getDiscountAmount(){
        return discount.getDiscount();
    }    
}
