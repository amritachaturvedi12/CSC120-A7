/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;

  /**
   * Constructs a House object, which inherits from the Building class.
   * @param name name of the house
   * @param address address of the house
   * @param floors number of floors in the house
   * @param eat if the house has a dining room
   * @param elevator if the house has an elevator
   */
  public House(String name, String address, int floors, boolean eat, boolean elevator) {
    super(name, address, floors);
    residents = new ArrayList<String>();
    this.hasDiningRoom = eat;
    this.hasElevator = elevator;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Overloaded constructor.
   * @param name name of the house
   * @param address address of the house
   * @param floors number of floors in the house
   */
  public House(String name, String address, int floors)
  {
    this(name, address, floors, false, false);
  }

  /**
   * Overloaded constructor.
   * @param name name of the house
   * @param address address of the house
   */
  public House(String name, String address)
  {
    this(name, address, 1, false, false);
  }

  /**
   * @return if the house has a dining room
   */
  public boolean hasDiningRoom()
  {
    return this.hasDiningRoom;
  }

  /**
   * @return the number of residents of the house
   */
  public int nResidents()
  {
    return this.residents.size();
  }

  /**
   * Adds a resident to the house.
   * @param name name of new resident
   */
  public void moveIn(String name)
  {
    if (this.residents.contains(name))
    {
      throw new RuntimeException(name + " is already a resident.");
    }
    else
      this.residents.add(name);
  }

  /**
   * Removes a resident from the house.
   * @param name name of resident leaving
   * @return
   */
  public String moveOut(String name) 
  {
    if (this.residents.contains(name))
    {   
      this.residents.remove(name);
    }
    else
      throw new RuntimeException(name + " is not a resident of this house.");

    return name;
  }

  /**
   * @param person name of person who may live in the house
   * @return if the person lives in this house
   */
  public boolean isResident(String person)
  {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    new House("Morrow", "10 Elm Street", 4, true, false);
  }

  public void showOptions()
  {
    super.showOptions();
    System.out.println("hasDiningRoom \n + nResidents() \n + moveIn() \n + moveOut() \n + isResident(a)");
  }

  public void goToFloor(int n)
  {
    if (!this.hasElevator && Math.abs(n - this.activeFloor) > 1) 
    {
      throw new RuntimeException("This building does not have an elevator.");
    }
    else
    {
      super.goToFloor(n);
    }
  }


}