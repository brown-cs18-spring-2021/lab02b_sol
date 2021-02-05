package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import src.Item;
import tester.Tester;

public class CatalogTest {
  public static Catalog makeStandardHelper() {
    Item a = new Item("sock", 10);
    Item b = new Item("sock", 10);
    Item c = new Item("sock with hole", 1);
    Item d = new Item("computer", 1000);
    Item e = new Item("CIT", 0);

    List<Item> catalog = new ArrayList<Item>();
    catalog.add(a);
    catalog.add(b);
    catalog.add(c);
    catalog.add(d);
    catalog.add(e);
    return new Catalog(catalog);
  }

  public static Catalog makeModifiedHelper() {
    Item a = new Item("sock", 5);
    Item b = new Item("sock", 5);
    Item c = new Item("sock with hole", 1);
    Item d = new Item("computer", 1000);
    Item e = new Item("CIT", 0);

    List<Item> catalog = new ArrayList<Item>();
    catalog.add(a);
    catalog.add(b);
    catalog.add(c);
    catalog.add(d);
    catalog.add(e);
    return new Catalog(catalog);
  }

  public static void testLookup(Tester t) {
    Catalog helper = makeStandardHelper();
    t.checkExpect(helper.lookupPrice("sock"), 10);

    Catalog emptyHelper = new Catalog(new LinkedList<Item>());
    t.checkExpect(emptyHelper.lookupPrice("sock"), -1);
  }

  public static void testCount(Tester t) {
    Catalog helper = makeStandardHelper();
    t.checkExpect(helper.countItems("sock"), 3);

    Catalog emptyHelper = new Catalog(new LinkedList<Item>());
    t.checkExpect(emptyHelper.countItems("sock"), 0);
  }

  public static void testFindItems(Tester t) {
    Catalog helper = makeStandardHelper();
    Item a = new Item("sock", 10);
    Item b = new Item("sock", 10);
    Item c = new Item("sock with hole", 1);

    List<Item> ans2 = new LinkedList<Item>();
    ans2.add(a);
    ans2.add(b);
    ans2.add(c);
    t.checkExpect(helper.findItems("sock"), ans2);
    
    Catalog emptyHelper = new Catalog(new LinkedList<Item>());
    t.checkExpect(emptyHelper.findItems("sock"), new LinkedList<Item>());
  }

  public static void testUpdate(Tester t) {
    Catalog helper = makeStandardHelper();
    Catalog sol = makeModifiedHelper();
    helper.updatePrice("sock", 5);
    t.checkExpect(helper.catalog, sol.catalog);
    helper.updatePrice("sock222", 5);
    t.checkExpect(helper.catalog, helper.catalog);
  }

  public static void main(String[] args) {
    Tester.run(new CatalogTest());
  }
}
