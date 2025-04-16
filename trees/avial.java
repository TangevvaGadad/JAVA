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
class bst{
    public static int h(Node root){
    if(root==null){
        return 0;
    }
    return (Math.max(h(root.left),h(root.right))+1);

}
public static Node ll(){

}
public static Node rr(){

}
public static Node rl(){

}
public static Node lr(){

}

public static Node bst(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=bst(root.left,data);
        }
        else{
            root.right=bst(root.right,data);
        }
        return root;
    }
public static void inorder(Node root){
    if(root!=null){
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

    public static void main(String[] args){
        Node root=null;
        int data[]={50,60,30,40,20,90,70};
        for(int i=0;i<data.length;i++)
            root=bst(root,data[i]);
        inorder(root);

    }

}