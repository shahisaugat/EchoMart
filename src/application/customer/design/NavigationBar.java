package application.customer.design;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author shahi
 */
public class NavigationBar extends javax.swing.JPanel {

    public NavigationBar() {
        initComponents();
        
        list = new ArrayList<>();
        timer = new Timer(0, (ActionEvent ae) -> {
            animate();
        });
    }

    private final List<Component> list;
    private final Timer timer;
    private Component comExit;
    private Component comShow;
    private int currentShowing;
    private boolean animateRight;
    private int animate = 1;

    public int getAnimate() {
        return animate;
    }

    public void setAnimate(int animate) {
        this.animate = animate;
    }
    
    public void init(Component... com) {
        if (com.length > 0) {
            for (Component c : com) {
                list.add(c);
                c.setSize(getSize());
                c.setVisible(false);
                this.add(c);
            }
            Component show = list.get(0);
            show.setVisible(true);
            show.setLocation(0, 0);
        }
    }
    
    public void show(int index) {
        if (!timer.isRunning()) {
            if (list.size() > 2 && index < list.size() && index != currentShowing) {
                comShow = list.get(index);
                comExit = list.get(currentShowing);
                animateRight = index < currentShowing;
                currentShowing = index;
                comShow.setVisible(true);
                if (animateRight) {
                    comShow.setLocation(-comShow.getWidth(), 0);
                } else {
                    comShow.setLocation(getWidth(), 0);
                }
                timer.start();
            }
        }
    }
    
    private void animate() {
        if (animateRight) {
            if (comShow.getLocation().x < 0) {
                comShow.setLocation(comShow.getLocation().x + animate, 0);
                comExit.setLocation(comExit.getLocation().x + animate, 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            } 
        } else {
            if (comShow.getLocation().x > 0) {
                comShow.setLocation(comShow.getLocation().x - animate, 0);
                comExit.setLocation(comExit.getLocation().x - animate, 0);
            } else {
                comShow.setLocation(0, 0);
                timer.stop();
                comExit.setVisible(false);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
