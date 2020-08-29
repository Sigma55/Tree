import java.util.LinkedList;
import java.util.Queue;

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
    private void bfsPrivate(Node curr){
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        while(!queue.isEmpty()){
            curr = queue.remove();
            System.out.println(curr.data);
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }

    }
    public void bfs(){
        bfsPrivate(this.root);
    }


    //max recursive
    private int maxPrivate(Node curr){
        if(curr.right == null){
            return curr.data;
        }
        return maxPrivate(curr.right);

    }

    public int maxRecursive(){
        return maxPrivate(this.root);
    }

    //max iterative
    private int maxPriv(Node curr){
        while(curr.right != null){
            curr = curr.right;
        }
        return curr.data;

    }
    public int maxIterative(){
        return maxPriv(this.root);

    }

    //invert tree iterative
    private Node invertPrivate(Node curr){
        if(curr == null){
            return curr;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(curr);
        while(!queue.isEmpty()){
            curr = queue.remove();
            //swap
            Node tmp = curr.left;
            curr.left = curr.right;
            curr.right = tmp;

            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }

        }
        return curr;
    }

    public Node invert(){
       return invertPrivate(this.root);
    }
}
