package thuc_hanh.composite.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class ManagerNode extends BinaryTree{
    List<BinaryTree> list = new ArrayList<>();
    public ManagerNode(int value) {
        super(value);
    }

    @Override
    void add(BinaryTree binaryTree) {
        list.add(binaryTree);
    }

    @Override
    void remove(BinaryTree binaryTree) {
        list.remove(binaryTree);
    }
    public String duyettrai(){
        StringBuilder builder = new StringBuilder();
        for (BinaryTree p:list)
            if(p.value>value)
                builder.append("cay con phai la").append(p.node());
        return builder.toString();
    }
    public String duyetphai(){
        StringBuilder builder = new StringBuilder();
        for (BinaryTree p:list)
            if(p.value<value)
                builder.append("cay con phai la").append(p.node());
        return builder.toString();
    }
    @Override
    String node() {
        return duyetphai() + duyettrai();
    }
}
