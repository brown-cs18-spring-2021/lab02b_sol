package sol;

import java.util.LinkedList;
import java.util.List;

import src.Item;

public class Catalog {
  public List<Item> catalog;

  public Catalog(List<Item> catalog) {
    this.catalog = catalog;
  }

  /**
   * Looks up the price of an item.
   * 
   * @param description - the description to match
   * @return the price of the first item in items whose description matches the
   *         input description.
   */
  int lookupPrice(String description) {
    for (Item i : catalog) {
      if (i.description.equals(description))
        return i.price;
    }

    return -1;
  }

  /**
   * Counts the number of items in the catalog whose descriptions contain a
   * given substring.
   * 
   * @param d - the substring to look for.
   * @return the number of items whose description contains d.
   */
  int countItems(String d) {
    int c = 0;

    for (Item i : catalog) {
      if (i.description.contains(d))
        c++;
    }

    return c;
  }

  /**
   * Returns a list of the items in the catalog whose descriptions contain a
   * given substring.
   * 
   * @param d - the substring to look for.
   * @return a list of all the items whose description contains d.
   */
  List<Item> findItems(String d) {
    List<Item> list = new LinkedList<Item>();

    for (Item i : catalog) {
      if (i.description.contains(d))
        list.add(i);
    }

    return list;
  }

  /**
   * Changes the price for all items with description d.
   *
   * @param d - the description to look for.
   * @return the number of items whose description is equal to d.
   */
  void updatePrice(String d, int newPrice) {
    for (Item i : catalog) {
      if (i.description.equals(d))
        i.price = newPrice;
    }
  }
  
  /**
   * Adds an item to the catalog.
   * 
   * @param item - an Item to add
   */
  void addItem(Item item) {
	  catalog.add(item);
  }
  
  /**
   * Removes an item from the catalog.
   * 
   * @param item - an Item to remove
   */
  void removeItem(Item item) {
	  catalog.remove(item);
  }
}
