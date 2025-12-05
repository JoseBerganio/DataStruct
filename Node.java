public class Node {//declares a public class named Node which is the building block of the tree
    
    int data;//a field that stores the integer value held by the node
    Node left;//reference to the left child node (or null if none)
    Node right;//reference to the right child node (or null if none)

    public Node(int data){//constructor that takes an int and creates a node with that value
        this.data = data;//stores the passed value in the node's data field
    }//ends the constructor
}//ends the class

//Node just holds a value and pointers to left/right children - the minimal structure for a binary tree node.