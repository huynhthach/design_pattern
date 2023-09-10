package thuc_hanh.composite.binary_tree;

public abstract class BinaryTree {
    int value;
    public BinaryTree(int value) {
        this.value = value;
    }
    abstract void add(BinaryTree binaryTree);
    abstract void remove(BinaryTree binaryTree);
    abstract String node();

}
