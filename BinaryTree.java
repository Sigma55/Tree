public class BinaryTree {

    Node root;

    //Add
    private Node insert(Node curr, int data){
        if(curr == null){
            curr = new Node(data);
        }
        if(data < curr.data){
            curr.left = insert(curr.left,data);
        }
        if(data > curr.data){
            curr.right = insert(curr.right,data);
        }
        return curr;
    }

    public void add(int data){
         this.root = insert(this.root, data);
    }


    //find
    private boolean findR(Node curr, int x){
        if(curr == null){
            return false;
        }
        if(curr.data == x){
            return true;
        }
        if(x > curr.data){
            return findR(curr.right,x);
        }
        else if(x < curr.data){
            return findR(curr.left,x);
        }
        return false;

    }
    public boolean find(int x){
        return findR(this.root, x);
    }

    //find iterative

    //inorder
    private void inorder(Node curr){
        if(curr.left !=null){
            inorder(curr.left);
        }
        System.out.println(curr.data);
        if(curr.right != null){
            inorder(curr.right);
        }
    }
    public void inorder2(){
        inorder(this.root);
    }

    //bfs


    //max
}
