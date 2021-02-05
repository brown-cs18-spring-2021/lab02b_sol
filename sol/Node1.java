package sol;

public class Node1 extends Node {
  /**
   * Instantiates a BST
   *
   * @param value - The value to be held in the root node.
   * @param left - The left subtree
   * @param right - The right subtree
   */
  public Node1(int value, IBST left, IBST right) {
    super(value, left, right);
  }

  public Node1(int value) {
	super(value, new Leaf1(), new Leaf1());
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
}
