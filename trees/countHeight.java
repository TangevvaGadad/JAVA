import java.util.Stack;
import static java.lang.Math.*;

    class Node{
        int data;
        Node left;
        Node right;
        
    
    Node(int d){
        this.data=d;
        this.left=null;
        this.right=null;
    }
    }
class countHeight{
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(5);


        System.out.println(h(root)-1);

    }


public static int h(Node root){
    if(root==null){
        return 0;
    }
    return (Math.max(h(root.left),h(root.right))+1);

}
}