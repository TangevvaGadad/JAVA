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
class post{
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        preorder(root);
                System.out.println();

    }


public static void preorder(Node root){
    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while(!stack.isEmpty()){
       Node node=stack.pop();
        System.out.print(node.data+" ");

        if(node.right!=null)
            stack.push(node.right);
        if(node.left!=null)
            stack.push(node.left);
    }

}
}