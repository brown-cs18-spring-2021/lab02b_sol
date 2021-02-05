package sol;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements IBST {

  @Override
  public boolean isBST() {
	return false;
  }
	
  @Override
  public boolean contains(int n) {
    return false;
  }

  @Override
  public List<Integer> toList() {
	return new ArrayList<Integer>();
  }

@Override
public IBST insert(int n) {
	// TODO Auto-generated method stub
	return new Node(n, new Leaf(), new Leaf());
}

}
