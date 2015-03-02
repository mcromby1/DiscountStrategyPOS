package Version1;

/**
 *
 * @author Matthew
 */
public class CashRegister {

    private String empID;
    private String custID;
    private LineItem[] lineItems = new LineItem[0];

    public CashRegister() {
    }

    public CashRegister(String empID) {
        this.empID = empID;
    }

    public final String getEmpID() {
        return empID;
    }

    public final void setEmpID(String empID) {
        this.empID = empID;
    }

    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        this.custID = custID;
    }

    public final void addItem(String productID, int quantity) {
        LineItem[] tempItem = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItem, 0, lineItems.length);
        LineItem newItem = new LineItem(productID, quantity);
        tempItem[tempItem.length - 1] = newItem;
        lineItems = tempItem;
    }

    public final void cancelOrder() {
        custID = null;
        lineItems = new LineItem[0];
    }
    
    public final void endSale(){
        RecieptInvoiceStrategy paperReciept = new RecieptInvoiceStrategy(lineItems, custID);
        paperReciept.printReceipt();
    }
}
