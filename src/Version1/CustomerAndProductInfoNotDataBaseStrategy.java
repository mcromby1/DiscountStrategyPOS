package Version1;

/**
 *
 * @author Matthew
 */
public final class CustomerAndProductInfoNotDataBaseStrategy implements DataStorable {

    private final Customer[] customers = {
        new Customer("A1243", "Bob Roberts"),
        new Customer("A2234", "Amanda Williams"),
        new Customer("B0123", "Logan Bradly")};

    private final Product[] products = {
        new Product("A101", "iPhone", 599.95, new NoDiscountStrategy()),
        new Product("B101", "T-Shirt", 19.99, new QuantityDiscountStrategy(2, 5)),
        new Product("C230", "Toy Car", 5.99, new PercentageDiscountStrategy(.1, 5.99))};

    public CustomerAndProductInfoNotDataBaseStrategy() {
    }
    
    @Override
    public final Customer getCustomerInfo(String custID) {
        Customer c1 = new Customer();
        for (int n = 0; n < customers.length; n++) {
            if (custID.equalsIgnoreCase(customers[n].getCustomerID())) {
                c1 = customers[n];
            }
        }
        return c1;
    }

    @Override
    public final Product getProductInfo(String prodID) {
        Product p1 = new Product();
        for (int n = 0; n < customers.length; n++) {
            if (prodID.equalsIgnoreCase(products[n].getProductID())) {
                p1 = products[n];
            }
        }
        return p1;
    }
}
