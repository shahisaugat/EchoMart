package application.customer.main;

import application.customer.forms.AboutUsForm;
import application.customer.forms.AfilliateForm;
import application.customer.forms.ContactForm;
import application.customer.forms.LoginForm;
import application.customer.forms.SignupForm;
import application.customer.forms.TermsConditions;
import application.customer.menu.MenuMethodForm;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Component;
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
    private final MenuMethodForm menuMethods;
    

    public EchoMartRunner() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new Dimension(1366, 768));
        
        loginForm = new LoginForm();
        menuMethods = new MenuMethodForm();
        
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
    
    public static void changeContentPane(Component component) {
        component.applyComponentOrientation(application.getComponentOrientation());
        application.menuMethods.changeContentPane(component);
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
    
    public static void getIntoApp() {
        FlatAnimatedLafChange.showSnapshot();
        application.setContentPane(application.menuMethods);
        application.menuMethods.applyComponentOrientation(application.getComponentOrientation());
        setSelectedMenu(0, 0);
        application.menuMethods.hideMenu();
        SwingUtilities.updateComponentTreeUI(application.menuMethods);
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }
    
    public static void setSelectedMenu(int index, int subIndex) {
        application.menuMethods.setSelectedMenu(index, subIndex);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuMethodForm1 = new application.customer.menu.MenuMethodForm();
        panelRound1 = new application.customer.design.PanelRound();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setText("Click Me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menuMethodForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1077, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuMethodForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Hello Saugat");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        FlatLaf.registerCustomDefaultsSource("application.customer.theme");
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(() -> {
            application = new EchoMartRunner();
            application.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private application.customer.menu.MenuMethodForm menuMethodForm1;
    private application.customer.design.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
