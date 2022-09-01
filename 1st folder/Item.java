public class Item {
    int price;
    int weight;
    int quantity;
    String description;
    boolean canbetraded;
    String name;

    //Item method
    public void itemDescription() {
        System.out.println("This is a " + name + " It is worth " + price + " moras " + " Character can get " + quantity + " pieces " + " This can " + description);
    }
}

    
