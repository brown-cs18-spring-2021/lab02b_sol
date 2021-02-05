package sol;

import java.util.Collections;
import java.util.List;

import sol.IBST;

/**
 * Class for your oracle methods.
 */
public class Oracle {

  /**
   * Method to see if a tree contains the same elems as a list.
   *
   * @param tree - the IBinTree whose elements we are checking
   * @param list - the list whose elements we are comparing with the tree
   * @return a boolean indicating if tree and list have exactly the same
   *         elements
   */
  public static boolean sameElems(IBST tree, List<Integer> list) {
    List<Integer> treeList = tree.toList();
    Collections.sort(treeList);
    Collections.sort(list);
    return treeList.equals(list);
  }

  /**
   * Oracle method to test the makeTree method from IBSTMaker.
   *
   * @param tree - the tree to test
   * @param list - the list from which the tree was created
   * @return a boolean indicating if tree is a valid BST containing exactly the
   *         same elements as list.
   */
  public static boolean bstOracle(IBST tree, List<Integer> list) {
    return sameElems(tree, list) && tree.isBST();
  }

}
