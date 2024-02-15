package application.customer.menu;

/**
 *@author shahi
**/

public interface MenuEvent {

    public void menuSelected(int index, int subIndex, MenuAction action);
}
