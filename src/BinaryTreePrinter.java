import java.util.LinkedList;

public class BinaryTreePrinter {
    
    private LinkedList<Node> childNodeGroup = new LinkedList<Node>();
    private LinkedList<Node> neighberNodeGroup = null;
    
    void printTree(Node root) {
        childNodeGroup.add(root);
        
        while (!childNodeGroup.isEmpty()) {
            toNextLevel();
            printNeighberNodes();
        }
    }
    
    private void toNextLevel() {
        neighberNodeGroup = new LinkedList<Node>(childNodeGroup);
        childNodeGroup.clear();
    }
    
    private void printNeighberNodes() {
        Node node = null;
        
        while (!neighberNodeGroup.isEmpty()) {
            node = neighberNodeGroup.removeFirst();
            
            addChildNodeIntoGroup(node);
            
            System.out.print("" + node.value);
            
            separatedOrEndLine();
        }
    }
    
    private void addChildNodeIntoGroup(Node node) {
        if (null != node.left) {
                childNodeGroup.add(node.left);
            }
            if (null != node.right) {
                childNodeGroup.add(node.right);
            }
    }
    
    private void separatedOrEndLine() {
        if (neighberNodeGroup.isEmpty()) {
            System.out.println("");
        } else {
            System.out.print(" ");
        }
    }
}