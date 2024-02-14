package application.customer.main;

import application.customer.forms.AboutUsForm;
import application.customer.forms.AfilliateForm;
import application.customer.forms.ContactForm;
import application.customer.forms.LoginForm;
import application.customer.forms.SignupForm;
import application.customer.forms.TermsConditions;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import raven.glasspanepopup.GlassPanePopup;
import raven.toast.Notifications;

/**
 *
 * @author shahi
 */
public class EchoMartRunner extends javax.swing.JFrame {
    
    private static EchoMartRunner application;
    private final LoginForm loginForm;
    private final AboutUsForm aboutUs;
    private final AfilliateForm afilliateForm;
    private final ContactForm contactForm;
    private final TermsConditions termsForm;
    private final SignupForm signUpForm;

    public EchoMartRunner() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new Dimension(1366, 768));
        
        loginForm = new LoginForm();
        
        aboutUs = new AboutUsForm();
        afilliateForm = new AfilliateForm();
        contactForm = new ContactForm();
        termsForm = new TermsConditions();
        signUpForm = new SignupForm();
        
        
        setContentPane(loginForm);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        GlassPanePopup.install(this);
        Notifications.getInstance().setJFrame(this);
    }

    public static void openAboutUsForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.aboutUs);
        application.aboutUs.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.aboutUs);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openContactForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.contactForm);
        application.contactForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.contactForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openAfilliateForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.afilliateForm);
        application.afilliateForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.afilliateForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openTermsForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.termsForm);
        application.termsForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.termsForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openLoginForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.loginForm);
        application.loginForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.loginForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void openSignUpForm() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.signUpForm);
        application.signUpForm.applyComponentOrientation(application.getComponentOrientation());
        SwingUtilities.updateComponentTreeUI(application.signUpForm);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        FlatLaf.registerCustomDefaultsSource("application.customer.theme");
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            application = new EchoMartRunner();
            application.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
