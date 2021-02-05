package sol;

import java.util.ArrayList;
import java.util.List;

public class Node implements IBST {

  protected int value;
  protected IBST left;
  protected IBST right;

  /**
   * Instantiates a BST
   *
   * @param value - The value to be held in the root node.
   * @param left - The left subtree
   * @param right - The right subtree
   */
  public Node(int value, IBST left, IBST right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean isBST() {
    return this.left.allLess(this.value) && this.left.isBST()
            && this.right.allGreaterEq(this.value) && this.right.isBST();
  }

  @Override
  public boolean allLess(int val) {
    return this.value < val && this.left.allLess(val) && this.right.allLess(val);
  }

  @Override
  public boolean allGreaterEq(int val) {
    return this.value >= val && this.left.allGreaterEq(val)
            && this.right.allGreaterEq(val);
  }

  @Override
  public List<Integer> toList() {
    List<Integer> lst = this.left.toList();
    lst.addAll(this.right.toList());
    lst.add(this.value);
    return lst;
  }




  @Override
  public IBST insert(int n) {
    if (n < this.value) {
      this.left = this.left.insert(n);
    } else {
      this.right = this.right.insert(n);
    }
    return this;
  }

  @Override
  public boolean contains(int n) {
    if (this.value == n) {
      return true;
    } else if (this.value < n) {
      return this.right.contains(n);
    } else {
      return this.left.contains(n);
    }
  }
}
