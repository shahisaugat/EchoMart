package application.customer.model;

/**
 *
 * @author shahi
 */
public class CustomerProfile {

    public String getEmailAddress() {
        return emailAddress;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getProvince() {
        return province;
    }
    private final String emailAddress;
    private final byte[] imageData;
    private final String contactNumber;
    private final String dateOfBirth;
    private final String shippingAddress;
    private final String province;
    
    public CustomerProfile(String emailAddress, byte[] imageData, 
            String contactNumber, String dateOfBirth, String shippingAddress, String province) {
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.imageData = imageData;
        this.contactNumber = contactNumber;
        this.province = province;
        this.shippingAddress = shippingAddress;
    }
}
