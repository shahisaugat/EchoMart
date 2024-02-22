package application.customer.model;

import java.math.BigDecimal;

/**
 *
 * @author shahi
 */
public class CatalogModel {
    
    private final String pTitle;
    private final String pDesc;
    private final BigDecimal pPrice;
    private final int dStatus;
    private final String pCondition;
    private final byte[] img1;
    private final byte[] img2;
    private final byte[] img3;
    private final String date;
    private final String email;
    private final String location;
    private final int pCategory;

    public String getpTitle() {
        return pTitle;
    }

    public String getpDesc() {
        return pDesc;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public int getdStatus() {
        return dStatus;
    }

    public String getpCondition() {
        return pCondition;
    }

    public byte[] getImg1() {
        return img1;
    }

    public byte[] getImg2() {
        return img2;
    }

    public byte[] getImg3() {
        return img3;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getLocation() {
        return location;
    }

    public int getpCategory() {
        return pCategory;
    }
    
    public CatalogModel(int pCategory, String pTitle, String pDesc, BigDecimal pPrice, int dStatus, String date, String pCondition, String location, byte[] img1, byte[] img2, byte[] img3, String email) {
        
        this.pTitle = pTitle;
        this.pDesc = pDesc;
        this.pPrice = pPrice;
        this.pCondition = pCondition;
        this.dStatus = dStatus;
        this.date = date;
        this.email = email;
        this.location = location;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.pCategory = pCategory;
    }
    
    
}
