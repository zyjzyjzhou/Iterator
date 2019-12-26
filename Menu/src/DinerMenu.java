import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS=6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems=new MenuItem[MAX_ITEMS];

        addItems("Vegetarian BLT","I don't want to write something here!",true,2.99);
    }

    public void addItems(String name, String description, boolean vegetable, double price){
        MenuItem menuItem=new MenuItem(name, description, vegetable, price);
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("Sorry, menu is full!");
        }else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems=numberOfItems+1;
        }
    }


    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
