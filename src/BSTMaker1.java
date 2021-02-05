package src;

import java.util.List;

import sol.*;

public class BSTMaker1 implements IBSTMaker {
  @Override
  public IBST makeBST(List<Integer> list) {
    IBST root;

    if (list.isEmpty()) {
      return new Leaf1();
    } else {
      root = new Node1(list.get(0), new Leaf1(), new Leaf1());
      List<Integer> items = list.subList(1, list.size());

      for (Integer item : items) {
        root = root.insert(item);
      }
    }

    return root;
  }
}
