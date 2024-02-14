package application.customer.model;

/**
 *
 * @author shahi
 */
public class CustomerData {
    private final String fullName;
    private final String lastName;
    private final String emailAddress;
    private final String password;

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }
    
    public CustomerData(String fullName, String lastName, String emailAddress, String password) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
    }  
}
