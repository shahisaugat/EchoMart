package application.customer.main;

import application.customer.forms.LoginForm;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author shahi
 */
public class EchoMartRunner extends javax.swing.JFrame {
    
    private static EchoMartRunner application;
    private final LoginForm loginForm;

    public EchoMartRunner() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(new Dimension(1366, 768));
        
        loginForm = new LoginForm();
        setContentPane(loginForm);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
