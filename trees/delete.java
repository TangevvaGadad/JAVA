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
class delete{
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);



}
public static void inorder(Node root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
}

public static void delete(Node root,int key){
    if(root==null)
        return null;
    if(key<root.data)
        root.left=delete(root.left,key);
    else if(key>root.data)
        root.right=delete(root.right,key);
    else{
        if(root.left==null)
            return root.right;
        else if(root.right==null)
            return root.left;
        Node t=root.right;
        while(t!=null){
            t=t.left;
        }
    }

}
}