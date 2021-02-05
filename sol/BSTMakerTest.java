package sol;

import java.util.ArrayList;
import java.util.Arrays;

import sol.IBST;
import src.BSTMaker1;
import src.BSTMaker2;
import tester.Tester;

public class BSTMakerTest {
  BSTMaker1 b1 = new BSTMaker1();
  BSTMaker2 b2 = new BSTMaker2();

  public void testLeaf(Tester t) {
    IBST t1 = this.b1.makeBST(new ArrayList<Integer>());
    IBST t2 = this.b2.makeBST(new ArrayList<Integer>());

    t.checkExpect(Oracle.bstOracle(t1, new ArrayList<Integer>()), "b1, leaf");
    t.checkExpect(Oracle.bstOracle(t2, new ArrayList<Integer>()), "b2, leaf");
  }

  public void testDupTree(Tester t) {
    IBST t1 = this.b1.makeBST(Arrays.asList(1, 2, 2, 2));
    IBST t2 = this.b2.makeBST(Arrays.asList(1, 2, 2, 2));
    t.checkExpect(Oracle.bstOracle(t1, Arrays.asList(1, 2, 2, 2)), "b1, dups");
    //the below test is supposed to fail
    t.checkExpect(Oracle.bstOracle(t2, Arrays.asList(1, 2, 2, 2)), "b2, dups");
  }

  public void testRegTree(Tester t) {
    IBST t1 = this.b1.makeBST(Arrays.asList(1, 2, 3, 4));
    IBST t2 = this.b2.makeBST(Arrays.asList(1, 2, 3, 4));

    t.checkExpect(Oracle.bstOracle(t1, Arrays.asList(1, 2, 3, 4)), "b1, reg");
    t.checkExpect(Oracle.bstOracle(t2, Arrays.asList(1, 2, 3, 4)), "b2, reg");
  }

  public static void main(String[] args) {
    Tester.run(new BSTMakerTest());
  }
}
