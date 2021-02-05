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
	return false;
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
  
  @Override
  public List<Integer> toList() {
	return new ArrayList<Integer>();
  }

  @Override
  public String toString() {
    String out = this.value + "\n";
    out += indentString(this.left.toString()) + "\n";
    out += indentString(this.right.toString());
    return out;
  }

  /**
   * Helper for toString.
   *
   * @param in - the toString representation so far.
   * @return a properly indented version of in.
   */
  public String indentString(String in) {
    String output = "";
    String[] lines = in.split("\n");

    for (int i = 0; i < lines.length; i++) {
      output += "  " + lines[i] + "\n";
    }

    // removes the last newline
    return output.substring(0, output.length() - 1);
  }
}
