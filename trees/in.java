    import java.util.Stack;

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
class in{

    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        inorder(root);
                System.out.println();
        in(root);

    }
    public static void in(Node root){
    if(root!=null){
        in(root.left);
        System.out.print(root.data);
        in(root.right);
    }
}


public static void inorder(Node root){
    Stack<Node> stack = new Stack<>();
    Node t=root;

    while(t!=null || !stack.isEmpty()){
        while(t!=null){
            stack.push(t);
            t=t.left;
        }
        Node node=stack.pop();
        System.out.print(node.data+" ");
        t=node.right;
        }
}


}
