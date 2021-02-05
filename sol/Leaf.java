package sol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leaf implements IBST {

    @Override
    public boolean isBST() {
        return true;
    }

    @Override
    public boolean allLess(int val) {
        return true;
    }

    @Override
    public boolean allGreaterEq(int val) {
        return true;
    }

    @Override
    public IBST insert(int n) {
        return new Node(n, new Leaf(), new Leaf());
    }

    @Override
    public boolean contains(int n) {
        return false;
    }

    @Override
    public List<Integer> toList() {
        return new ArrayList<Integer>();
    }

}
