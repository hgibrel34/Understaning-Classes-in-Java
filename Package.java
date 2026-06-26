// peer review code
public class Package {
    private static int numPackages = 0;
    private Destination destination;
    private String itemName;
    private double price;
    private boolean onSale;

    // Constructor: applies 6% tax on price
    public Package(String name, double p, Destination d) {
        itemName = name;
        price = p * 1.06;
        onSale = false;
        destination = new Destination(d.getCity(), d.getState(), d.getZipcode());
        numPackages++;
    }

    public Destination getDestination() { return destination; }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public boolean getOnSale() { return onSale; }

    public void setDestination(Destination d) { destination = new Destination(d.getCity(), d.getState(), d.getZipcode()); }
    public void setItemName(String n) { itemName = n; }
    public void setPrice(double p) { price = p; }
    public void setOnSale(boolean s) { onSale = s; }

    // Applies 20% discount if on sale
    public void salePrice() { if (onSale) price *= 0.8; }

    // Equal if same item name and destination
    public boolean equals(Package other) { return itemName.equals(other.itemName) && destination.equals(other.destination); }

    public String toString() { return String.format("Item: %s | Price: $%.2f | Dest: %s", itemName, price, destination); }

    public static int getNumPackages() { return numPackages; }
}
