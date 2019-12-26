import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu=cafeMenu;
    }

    public void printMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator PancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        while (dinerMenuIterator.hasNext()) {
            System.out.println(dinerMenuIterator.next());
        }
        while (PancakeHouseMenuIterator.hasNext()) {
            System.out.println(PancakeHouseMenuIterator.next());
        }
    }
}
