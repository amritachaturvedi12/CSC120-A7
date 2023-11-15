/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;
  private boolean hasElevator;

  /**
   * Constructs a Library object, which inherits from the Building class.
   * @param name name of the library
   * @param address address of the library
   * @param floors number of floors in the library
   * @param elevator if the library has an elevator
   */
  public Library (String name, String address, int floors, boolean elevator) 
  {
    super(name, address, floors);
    this.collection = new Hashtable<String, Boolean>();
    this.hasElevator = elevator;
    System.out.println("You have built a library: 📖");
  }
  
  /**
   * Overloaded constructor.
   * @param name name of the library
   * @param address address of the library
   * @param floors number of floors in the library
   */
  public Library(String name, String address, int floors)
  {
    this(name, address, floors, true);
  }

  /**
   * Overloaded constructor.
   * @param name name of the library
   * @param address address of the library
   * @param elevator if the library has an elevator
   */
  public Library(String name, String address, boolean elevator)
  {
    this(name, address, 1, elevator);
  }

  /**
   * Adds a book to the library's collection.
   * @param title title of book being added
   */
  public void addTitle(String title)
  {
    this.collection.put(title, true);
  }

  /** Removes a book from the library's collection.
   * @param title title of book being removed
   * @return title of book being removed
   */
  public String removeTitle(String title)
  {
    this.collection.remove(title);
    return title;
  }

  /**
   * Checks out a book from the library by making it unavailable.
   * @param title title of the book
   */
  public void checkOut(String title)
  {
    if (this.collection.contains(title))
      this.collection.replace(title, false);
    else
      throw new RuntimeException(title + " is not in this library's collection.");
  }

  /**
   * Returns a book to the library by making it available.
   * @param title title of the book
   */
  public void returnBook(String title)
  {
    if (this.collection.contains(title))
      this.collection.replace(title, true);
    else
      throw new RuntimeException(title + " is not in this library's collection.");

  }

  /**
   * @param title title of the book
   * @return if the library has the book
   */
  public boolean containsTitle(String title)
  {
    return this.collection.containsKey(title);
  }

  /**
   * @param title title of the book
   * @return if the book is currently available in the library
   */
  public boolean isAvailable(String title)
  {
    return this.collection.get(title);
  }
  
  /**
   * Prints the title of every book in the library and its availability.
   */
  public void printCollection() //not sure how to iterate through a hashtable
  {
    System.out.println(this.collection.toString());

  } 

  public static void main(String[] args) {
    new Library("Neilson", "7 Neilson Drive", 4, true);
  }

  public void showOptions()
  {
    super.showOptions();
    System.out.println("addTitle(a) \n + removeTitle(a) \n + checkOut(a) \n + returnBook(a) \n + containsTitle(a) \n +isAvailable(a) \n + printCollection()");
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