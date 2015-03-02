package Version1;

import java.text.DecimalFormat;

/**
 *
 * @author Matthew
 */
public class RecieptInvoiceStrategy implements Invoiceable {

    private LineItem[] lineItems;
    private String CustID;
    private final DataStorable dataBox = new CustomerAndProductInfoNotDataBaseStrategy();
    private Customer customers;

    public RecieptInvoiceStrategy() {
    }

    public RecieptInvoiceStrategy(LineItem[] lineItems, String CustID) {
        this.lineItems = lineItems;
        this.CustID = CustID;
        this.customers = dataBox.getCustomerInfo(CustID);
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    @Override
    public void printReceipt() {
        DecimalFormat formatter = new DecimalFormat("####0.00");
        double discountTotal = 0;
        double orderTotal = 0;

        System.out.println(CustID + ": " + customers.getCustomerName());

        for (LineItem l : lineItems) {
            l.setDiscountQuantity();
            System.out.println(l.getProductID() + " " + l.getProductDescription()
                    + " " + formatter.format(l.getProductPrice()));
            orderTotal += l.getProductPrice();
            if (l.getProductDiscount() > 0) {
                System.out.println("(" + formatter.format(l.getProductDiscount())+ ")");
                discountTotal += l.getProductDiscount();
            }
        }
        System.out.println("Subtotal: " + formatter.format(orderTotal));
        System.out.println("Discount: " + formatter.format(discountTotal));
        System.out.println("Grand Total: " + formatter.format((orderTotal - discountTotal)));

    }

}
