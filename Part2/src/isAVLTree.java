
//Determines the BST is AVL Tree.
public class isAVLTree {

    public boolean isAVLTree(BinarySearchTree bst){
        return isAVLTree(bst.root);
    }

    private boolean isAVLTree(BinaryTree.Node node){ // recursive method
        int leftH;
        int rightH;

        if (node == null)
            return true;

        rightH = height(node.right);
        leftH = height(node.left);

        if (Math.abs(rightH - leftH) <= 1 && isAVLTree(node.left)
                && isAVLTree(node.right))   // Difference between heights of left and right subtrees
            return true;                // cannot be more than one for all nodes.

        return false;
    }

    private int height(BinaryTree.Node node){ // calculate the height
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

}
