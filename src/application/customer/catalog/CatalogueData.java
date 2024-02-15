package application.customer.catalog;

import javax.swing.Icon;

/**
 *
 * @author shahi
 */
public class CatalogueData {

    public Icon getProductImage() {
        return productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }
    private final Icon productImage;
    private final String productName;
    private final String productPrice;
    private final String shippingStatus;
    private final String deliveryTime;
    
    public CatalogueData(Icon productImage, String productName, String productPrice, String shippingStatus, String deliveryTime) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.shippingStatus = shippingStatus;
        this.deliveryTime = deliveryTime;
    }
}
