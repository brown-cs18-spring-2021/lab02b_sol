package sol;

import java.util.LinkedList;
import java.util.List;

import tester.Tester;

public class OracleTest {
  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....3.......7.........................................|
   *          .../.\...../.\........................................|
   *          .()...4...().().......................................|
   */
  public void testBST1(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(4);
    elems.add(5);
    elems.add(7);

    t.checkExpect(Oracle.bstOracle(bt, elems));
  }

  /**
   * Tests the sameElems method with an empty BST.
   *
   * @param t the Tester
   */
  public void testBSTEmpty(Tester t) {
    Leaf1 bt = new Leaf1();
    List<Integer> emptyList = new LinkedList<Integer>();

    // TODO: Add a checkExpect
  }

  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....3.......5.........................................|
   *          .../.\...../.\........................................|
   *          .()...4...().().......................................|
   */
  public void testBSTDup(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(5));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(4);
    elems.add(5);
    elems.add(5);

    // TODO: Add a checkExpect
  }

  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....3.......7.......................................|
   *          .../.\................................................|
   *          .()...4...............................................|
   */
  public void testBST2(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(4);
    elems.add(5);

    // TODO: Add a checkExpect
  }

  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....3.......7.........................................|
   *          .../.\...../.\........................................|
   *          .()...4...().().......................................|
   */
  public void testBST3(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(3, new Leaf1(), new Node1(4)), new Node1(7));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(4);
    elems.add(6);
    elems.add(7);

    // TODO: Add a checkExpect
  }

  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....4.......7.........................................|
   *          .../.\...../.\........................................|
   *          .()...3...().().......................................|
   */
  public void testBST4(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(4, new Leaf1(), new Node1(3)), new Node1(7));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(4);
    elems.add(5);
    elems.add(7);

    // TODO: Add a checkExpect
  }

  /**
   * Tests the bstOracle method with a standard BST.
   *
   * @param t the Tester
   *
   *          ........5.............................................|
   *          ...../.....\..........................................|
   *          ....3.......7.........................................|
   *          .../.\...../.\........................................|
   *          .()...6...().().......................................|
   */
  public void testBST5(Tester t) {
    Node1 bt =
        new Node1(5, new Node1(3, new Leaf1(), new Node1(6)), new Node1(7));
    List<Integer> elems = new LinkedList<Integer>();
    elems.add(3);
    elems.add(6);
    elems.add(5);
    elems.add(7);

    // TODO: Add a checkExpect
  }
  
  public static void main(String[] args) {
	  Tester.run(new OracleTest());
  }
}
