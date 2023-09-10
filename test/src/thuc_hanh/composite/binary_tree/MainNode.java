package thuc_hanh.composite.binary_tree;

public class MainNode {
    public static void main(String[] args) {
        BinaryTree binaryTree = new ManagerNode(1);
        BinaryTree binaryTree1 = new Node(2);
        BinaryTree binaryTree2 = new Node(1);
        BinaryTree binaryTree3 = new Node(5);
        binaryTree.add(binaryTree1);
        binaryTree.add(binaryTree2);
        binaryTree.add(binaryTree3);
        System.out.println(binaryTree.node());
    }
}
