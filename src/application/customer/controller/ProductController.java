package application.customer.controller;

import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class ProductController {

    private ImageIcon img;
    private String name;
    private String price;
    private String status;
    private String cond;

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }
    
    public ProductController(ImageIcon img, String name, String price, String status, String cond) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.status = status;
        this.cond = cond;
    }
}
