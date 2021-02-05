package sol;

public class Leaf2 extends Leaf {
  @Override
  public IBST insert(int n) {
    return new Node2(n, new Leaf2(), new Leaf2());
  }

}
