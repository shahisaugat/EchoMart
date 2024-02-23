package application.customer.controller;

import javax.swing.ImageIcon;

/**
 *
 * @author shahi
 */
public class CatalogueController {

    private int pID;

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCondition() {
        return pCondition;
    }

    public void setpCondition(String pCondition) {
        this.pCondition = pCondition;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public ImageIcon getImage1() {
        return image1;
    }

    public void setImage1(ImageIcon image1) {
        this.image1 = image1;
    }

    public ImageIcon getImage2() {
        return image2;
    }

    public void setImage2(ImageIcon image2) {
        this.image2 = image2;
    }

    public ImageIcon getImage3() {
        return image3;
    }

    public void setImage3(ImageIcon image3) {
        this.image3 = image3;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public String getoMail() {
        return oMail;
    }

    public void setoMail(String oMail) {
        this.oMail = oMail;
    }

    public String getoContact() {
        return oContact;
    }

    public void setoContact(String oContact) {
        this.oContact = oContact;
    }

    public String getoRep() {
        return oRep;
    }

    public void setoRep(String oRep) {
        this.oRep = oRep;
    }
   private String pName;
   private String pCondition;
   private String pDesc;
   private ImageIcon image1;
   private ImageIcon image2;
   private ImageIcon image3;
   private String oName;
   private String oMail;
   private String oContact;
   private String oRep;
   
   public CatalogueController(int pID, String pName, String pCondition, String pDesc, ImageIcon image1, ImageIcon image2, ImageIcon image3, String oName, String oMail, String oContact, String oRep) {
       this.pID = pID;
       this.pName = pName;
       this.pCondition = pCondition;
       this.pDesc = pDesc;
       this.image1 = image1;
       this.image2 = image2;
       this.image3 = image3;
       this.oName = oName;
       this.oContact = oContact;
       this.oMail = oMail;
       this.oRep = oRep;
   }
}
