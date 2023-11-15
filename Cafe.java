/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Constructs a Cafe object, which inherits from the Building class.
     * @param name name of the cafe
     * @param address address of the cafe
     * @param floors number of floors in the cafe
     * @param coffee amount of coffee the cafe starts with
     * @param sugar amount of sugar the cafe starts with
     * @param cream amount of cream the cafe starts with
     * @param cups number of cups the cafe starts with
     */
    public Cafe (String name, String address, int floors, int coffee, int sugar, int cream, int cups) {
        super(name, address, floors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Overloaded constructor.
     * @param name name of the cafe
     * @param address address of the cafe
     * @param floors number of floors in the cafe
     */
    public Cafe (String name, String address, int floors)
    {
        this(name, address, floors, 0, 0, 0, 0);
    }

    /**
     * Sells coffee from a cafe by decreasing its inventory.
     * @param size number of ounces of coffee in an order
     * @param sugar number of sugar packets in an order
     * @param cream amount of cream in an order
     */
    public void sellCoffee(int size, int sugar, int cream)
    {
        if (this.nCoffeeOunces < size || this.nSugarPackets < sugar || this.nCreams < cream || this.nCups < 1)
            this.restock(500, 100, 100, 100);
        
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups --;
    }

    /**
     * Sells a cup of black coffee.
     * @param size number of ounces of coffee in an order
     */
    public void sellCoffee(int size)
    {
        this.sellCoffee(size, 0, 0);
    }

    /**
     * Restocks the inventory of a cafe.
     * @param coffee amount of coffee being added
     * @param sugar amount of sugar being added
     * @param cream amount of cream being added
     * @param cups number of cups being added
     */
    private void restock(int coffee, int sugar, int cream, int cups)
    {
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
    }
    
    public static void main(String[] args) {
        new Cafe("Compass", "7 Neilson Drive", 1, 0, 0, 0, 0);
    }

    public void showOptions()
    {
        super.showOptions();
        System.out.println("sellCoffee(a,b,c) \n + restock(a,b,c)");
    }

    public void goToFloor(int n)
    {
        if (n != 1)
            throw new RuntimeException("You cannot leave this floor of the cafe.");
        else
            super.goToFloor(n); // this is silly because I don't know why this method would even be needed in the cafe class...
    }
    
}
