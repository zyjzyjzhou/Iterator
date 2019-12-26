import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItems("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun," +
                " lettuce, tomato, and fries", true, 3.99);
    }

    public void addItems(String name, String description, boolean vegetable, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetable, price);
        menuItems.put(menuItem.getName(), menuItem);
    }


    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
