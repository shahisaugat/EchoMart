package application.customer.methods;

import application.customer.dao.CustomerDAO;
import application.customer.forms.SignupForm;
import application.customer.model.CustomerData;

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
}
