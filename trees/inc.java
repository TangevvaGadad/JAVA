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
class inc{

    public static void main(String[] args){
        Node root=new Node(3);
        root.left=new Node(11);
        root.right=new Node(9);
        root.left.left=new Node(7);
        root.left.right=new Node(4);
        root.right.left=new Node(2);
        root.right.right=new Node(1);


        System.out.print(root.data);

        inc(root);
                System.out.println();



    }

public static void inc(Node root){
    if(root.left==null&&root.right==null){
        return;
    }
        System.out.print(root.left.data);
        System.out.print(root.right.data);
        inc(root.left);
        inc(root.right);
    
}

}