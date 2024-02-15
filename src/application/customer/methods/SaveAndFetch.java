package application.customer.methods;

import application.customer.dao.CustomerDAO;
import application.customer.forms.SignupForm;
import application.customer.model.CustomerData;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class SaveAndFetch {
    public static boolean registerAccount(SignupForm signup) {
        CustomerDAO daoCustomer = new CustomerDAO();
        
        CustomerData dataCustomer = new CustomerData(
                signup.getFNameTextField(),
                signup.getLNameTextField(),
                signup.getEmailTextField(),
                signup.getPwdTextField()
        );
        
        boolean check = daoCustomer.saveCustomerData(dataCustomer);
        return check;
    }
    
    public static boolean performLogin(String emailAddress, String enteredPassword) {
        CustomerDAO customerAuth = new CustomerDAO();

        CustomerDAO.LoginStatus loginStatus = customerAuth.validateLogin(emailAddress, enteredPassword);

        switch (loginStatus) {
            case SUCCESS -> {
                Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Successfully logged in");
                return true;
            }
            case INVALID_PASSWORD -> JOptionPane.showMessageDialog(null, "Invalid password. Please try again.");
            case USER_NOT_FOUND -> JOptionPane.showMessageDialog(null, "User does not exist. Please register first.");
            case ERROR -> JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
            default -> {
            }
        }
        return false;
    }
}

