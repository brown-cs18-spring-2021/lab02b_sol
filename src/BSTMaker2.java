package src;

import java.util.List;

import sol.*;

public class BSTMaker2 implements IBSTMaker {
  @Override
  public IBST makeBST(List<Integer> list) {
    IBST root;

    if (list.isEmpty()) {
      return new Leaf2();
    } else {
      root = new Node2(list.get(0), new Leaf2(), new Leaf2());
      List<Integer> items = list.subList(1, list.size());

      for (Integer item : items) {
        root = root.insert(item);
      }
    }

    return root;
  }
}
