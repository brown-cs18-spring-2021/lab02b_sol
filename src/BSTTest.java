package src;

import tester.Tester;
import sol.*;

public class BSTTest {

  public void testLeaf(Tester t) {
    IBST leaf = new Leaf1();
    t.checkExpect(leaf.isBST(), true);
    int nc = 12;
    t.checkExpect(leaf.contains(nc), false);
    leaf = leaf.insert(nc);
    t.checkExpect(leaf, new Node1(nc, new Leaf1(), new Leaf1()));
    t.checkExpect(leaf.isBST(), true);
    t.checkExpect(leaf.contains(nc), true);
  }

  public void testSmallTrees(Tester t) {
    int twelve = 12;
    int thirteen = 13;
    int fourteen = 14;
    IBST small = new Node1(thirteen, new Leaf1(), new Leaf1());
    t.checkExpect(small.isBST(), true);
    t.checkExpect(small.contains(twelve), false);
    t.checkExpect(small.contains(thirteen), true);
    t.checkExpect(small.contains(fourteen), false);
    small.insert(twelve);
    small.insert(fourteen);
    t.checkExpect(small, new Node1(thirteen, new Node1(twelve, new Leaf1(),
        new Leaf1()), new Node1(fourteen, new Leaf1(), new Leaf1())));
    t.checkExpect(small.contains(twelve), true);
    t.checkExpect(small.contains(thirteen), true);
    t.checkExpect(small.contains(fourteen), true);
    t.checkExpect(small.isBST(), true);
    t.checkExpect(small.contains(15), false);
  }

  public void testBadTree(Tester t) {
    int twelve = 12;
    int thirteen = 13;
    IBST bad =
        new Node1(twelve, new Node1(thirteen, new Leaf1(), new Leaf1()), new Leaf1());
    t.checkExpect(bad.isBST(), false);
  }

  public static void main(String[] args) {
    Tester.run(new BSTTest());
  }

}
