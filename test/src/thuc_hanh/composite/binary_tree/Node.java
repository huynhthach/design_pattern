package thuc_hanh.composite.binary_tree;

public class Node extends BinaryTree{

    public Node(int value) {
        super(value);
    }

    @Override
    void add(BinaryTree binaryTree) {

    }

    @Override
    void remove(BinaryTree binaryTree) {

    }

    @Override
    String node() {
        return "my value" + value;
    }
}
