package application.customer.design;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author shahi
 */
public class NavigationItems extends javax.swing.JPanel {
    
    private NavigationBar nav;

    public NavigationItems(String cat1, String cat2, String cat3, String cat4) {
        initComponents();
        
        nav = new NavigationBar();
        
        item1.setText(cat1);
        item2.setText(cat2);
        item3.setText(cat3);
        item4.setText(cat4);
        
        item1.addActionListener(new ButtonClickListener());
        item2.addActionListener(new ButtonClickListener());
        item3.addActionListener(new ButtonClickListener());
        item4.addActionListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            
            item1.setBackground(null);
            item2.setBackground(null);
            item3.setBackground(null);
            item4.setBackground(null);
            
            item1.setForeground(Color.BLACK);
            item2.setForeground(Color.BLACK);
            item3.setForeground(Color.BLACK);
            item4.setForeground(Color.BLACK);
            
            
            source.setBackground(Color.decode("#FF5C00"));
            source.setForeground(Color.WHITE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item1 = new javax.swing.JButton();
        item2 = new javax.swing.JButton();
        item3 = new javax.swing.JButton();
        item4 = new javax.swing.JButton();

        item1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        item1.setText("New");
        item1.setFocusable(false);

        item2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        item2.setText("Watches");
        item2.setFocusable(false);

        item3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        item3.setText("Smartphones");
        item3.setFocusable(false);

        item4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        item4.setText("Electronics");
        item4.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(item3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                    .addComponent(item4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton item1;
    private javax.swing.JButton item2;
    private javax.swing.JButton item3;
    private javax.swing.JButton item4;
    // End of variables declaration//GEN-END:variables
}
