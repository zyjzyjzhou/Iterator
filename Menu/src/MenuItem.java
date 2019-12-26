public class MenuItem {
    String name;
    String description;
    boolean vegetable;
    double price;

    public MenuItem(String name, String description, boolean vegetable, double price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vegetable=" + vegetable +
                ", price=" + price +
                '}';
    }
}
