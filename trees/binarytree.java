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
class binarytree{

    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        inorder(root);
                System.out.println();

        preorder(root);
                System.out.println();

        postorder(root);


    }


public static void inorder(Node root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
}

public static void preorder(Node root){
    if(root!=null){
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}

public static void postorder(Node root){
    if(root!=null){
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
}
}