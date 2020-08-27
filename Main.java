public class Main {
    public static void main(String [] args){
       BinaryTree tree = new BinaryTree();
       tree.add(50);
       tree.add(90);
       tree.add(40);
       tree.add(20);
       tree.add(45);

       tree.inorder2();
       System.out.println(tree.find(45));
    }
}
