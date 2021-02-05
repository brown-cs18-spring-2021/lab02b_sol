package sol;

import java.util.List;

public interface IBST {

 /**
  * Checks the validity of the IBST.
  *
  * @return a boolean indicating whether the tree represented by the IBST
  *         follows the Binary Search Tree invariant
  */
  boolean isBST();
	
  /**
   * Inserts an element into the IBST.
   *
   * @param n - a Comparable to be inserted to the tree
   * @return the IBST resulting from inserting n into the current IBST
   */
  IBST insert(int n);

  /**
   * Checks whether a specific element is contained within the IBST.
   *
   * @param n - The element the user is searching for.
   * @return true if n is in the IBST, false otherwise.
   */
  boolean contains(int n);
  
  /**
   * Turns the IBST into a List of ints.
   * 
   * @return a List of only and all the ints contained in the IBST, with the
   *         right number of duplicates for each.
   */
  List<Integer> toList();
}
