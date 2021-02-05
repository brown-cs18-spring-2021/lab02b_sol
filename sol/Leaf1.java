package sol;

public class Leaf1 extends Leaf {
  @Override
  public IBST insert(int n) {
    return new Node1(n, new Leaf1(), new Leaf1());
  }
}
