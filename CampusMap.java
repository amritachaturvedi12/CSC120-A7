import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Morrow House", "1 Paradise Road Northampton, MA 01063", 4, true, false));
        myMap.addBuilding(new House("Chapin House", "3 Chapin Drive Northampton, MA 01063", 4, true, false));
        myMap.addBuilding(new House("Wilder House", "1 Mandelle Road Northampton, MA 01063", 4, true, true));
        myMap.addBuilding(new House("Northrop House", "49 Elm Street Northampton, MA 01063"));
        myMap.addBuilding(new Building("McConnell Hall", "2 Tyler Drive Northampton, MA 01063"));
        myMap.addBuilding(new Building("Scott/Ainsworth Gym", "102 Lower College Lane Northampton, MA 01063"));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive Northampton, MA 01063", 4, true));
        myMap.addBuilding(new Library("Hillyer Art Library", "22 Elm Street Northmapton, MA 01063", true));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street Northampton, MA 01063", 1));
        myMap.addBuilding(new Cafe("Compass Cafe", "7 Neilson Drive", 1));
        System.out.println(myMap);
    }
    
}
