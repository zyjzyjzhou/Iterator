import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetable, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.add(menuItem);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
