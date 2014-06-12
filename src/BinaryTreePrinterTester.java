import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryTreePrinterTester {
    @Test
    public void testPrintTree() {
        BinaryTreePrinter treePrinter = new BinaryTreePrinter();
        Node root = initRootNode();
        
        treePrinter.printTree(root);
    }
    
    private Node initRootNode() {
        Node root = new Node();
        root.value = 5;
        
        // node: 5
        addChileNodes(root, 3, 1);
        
        // node: 3
        addChileNodes(root.left, 9, 4);
        
        // node: 9
        addChileNodes(root.left.left, -1, -1);
        
        // node: 4
        addChileNodes(root.left.right, 2, -1);
        
        // node: 1
        addChileNodes(root.right, -1, 5);
        
        return root;
    }
    
    private void addChileNodes(Node node, int leftValue, int rightValue) {
        if (-1 != leftValue) {
            node.left = new Node();
            node.left.value = leftValue;
        }
        
        if (-1 != rightValue) {
            node.right = new Node();
            node.right.value = rightValue;
        }
    }
}
