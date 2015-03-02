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
public interface DataStorable {
    
    public abstract Customer getCustomerInfo(String custID);
    public abstract Product getProductInfo(String prodID);
    
}
