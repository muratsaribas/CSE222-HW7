import java.util.HashSet;
import java.util.Set;


//Determines the BST is Red-Black Tree.
public class isRedBlackTree {

    public boolean isRedBlackTree(BinarySearchTree bst){

        /* The root must be black. */
        if (bst.root != null && bst.root.isRed())
            return false;

        boolean flag = isRedBlack(bst.root);

        if (flag){ // Compliant with the coloring rule
            // For each node, all simple paths from the node to descendant
            // leaves contain the same number of black nodes.
            Set<Integer> countForRight = new HashSet<Integer>();
            Set<Integer> countForLeft = new HashSet<Integer>();
            calculateBlack(bst.root.right, countForRight, 0);
            calculateBlack(bst.root.left, countForLeft, 0);

            if(countForLeft.equals(countForRight))  // If the sets are not equal,
                return true;                        // it means that the tree is not a red-black tree.
            else                                    // Because for each node, all simple paths from the
                return false;                       // node to the lower leaves must contain the same number of black nodes.
        }
        else
            return false;
    }

    // Check the tree is compliant with coloring rule
    private boolean isRedBlack(BinaryTree.Node node){

        if (node == null)
            return true;

        /* If a node is red, then both its children are black. */
        if (node.isRed()){
            if (node.right != null && node.right.isRed())
                return false;
            if (node.left != null && node.left.isRed())
                return false;
        }

        return isRedBlack(node.left) && isRedBlack(node.right);

    }

    // For each node, all simple paths from the node to descendant
    // leaves contain the same number of black nodes.
    private void calculateBlack(BinaryTree.Node node, Set<Integer> countSet, int currentCount){
        if (node == null)
            return;
        if (!node.isRed()) // if a node is black, increase the count
            currentCount++;
        if (node.right == null && node.left == null){ // if a node is leaf, save the count in the set
            countSet.add(currentCount);
            return;
        }
        calculateBlack(node.left, countSet, currentCount);
        calculateBlack(node.right, countSet, currentCount);
    }

}
