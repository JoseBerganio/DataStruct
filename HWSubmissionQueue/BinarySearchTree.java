public class BinarySearchTree {
    
    Node root;

    //public method to insert a new node into the tree...It calls the helper and updates the root if the tree was empty.
    public void insert(Node node){
        System.out.println("Due in " + node.data + " day/s");
        root = insertHelper(root, node);
    }

    //helper method that actually places the node in the correct position...data stores the value being inserted
    private Node insertHelper(Node root, Node node){
        int data = node.data;

        if(root == null){//if current subtree is empty, put the new node here
            root = node;
            return root;
        }
        else if(data < root.data){//if the value is smaller, insert into the left subtree
            root.left = insertHelper(root.left, node);
        }
        else{//if the value is greater, into the right subtree
            root.right = insertHelper(root.right, node);
        }

        return root;//returns the (possibly modified) subtree root
    }

    public void display(){//public method to print the entire tree...Calls a helper starting at the root
        displayHelper(root);
    }

    public void displayHelper(Node root){

        //this prints values in sorted order(inorder traversal)
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    //public search method-returns true/false if the value exists
    public boolean search(int data){
        return searchHelper(root, data);
    }
    
    private boolean searchHelper(Node root, int data){

        if(root == null){//if subtree is empty, value not found
            return false;
        }
        else if(root.data == data){//if values match, found
            return true;
        }
        else if(root.data > data){
            return searchHelper(root.left, data);//if searching for a smaller value, go left
        }
        else{//otherwise, go right
            return searchHelper(root.right, data);
        }
    }

    //public remove method
    public void remove(int data){

        //first checks if value exists...Only then calls removeHelper
        if(search(data)){
            removeHelper(root, data);
        }
        else{//prints a message if value is not in the tree
            System.out.println(data + " could not be found");
        }
    }

    //the recursive function that performs deletion
    public Node removeHelper(Node root, int data){

        if(root == null){//if subtree is empty, nothing to delete
            return root;
        }
        else if(data < root.data){//value is smaller, search left
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){//value is larger, search right
            root.right = removeHelper(root.right, data);
        }
        else{
            if(root.left == null && root.right == null){//if node has no children, just delete it
                root = null;
            }
            else if(root.right != null){//replaces the node's value with the successor(smallest right-subtree value)...Then delete the duplicate from right subtree
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{//replaces the node's value with the predecessor(largest left-subtree value)...Then delete the duplicate from left subtree
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;//return the updated subtree root
    }

    private int successor(Node root){
        root = root.right;//successor=minimum value in the right subtree
        while(root.left != null){//keep going left until you reach smallest
            root = root.left;//return the smallest value
        }
        return root.data;
    }
    private int predecessor(Node root){
        if(root == null || root.left == null){//checks if root is null or there is no left subtree...if either is true, there's no predecessor in left subtree
            return Integer.MIN_VALUE;//placeholder value to indicate no predecessor
        }
        root = root.left;//move into the left subtree of the original node
        while(root.right != null){//loop while the current node has a right child...Moving right finds larger values within the left subtree
            root = root.right;//move one step right...Repeating this reaches the rightmost (largest) node in the left subtree
        }
        return root.data;//return the integer stored in that node-the inorder predecessor value
    }
}
