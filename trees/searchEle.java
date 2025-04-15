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
class searchEle{
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
    public static boolean search(Node root,int key){
        if(root==null)
            return false;
        if(root.data==key)
            return true;
        if(root.data>key)
            return search(root.left,key);
        else    
            return search(root.right,key);

    }
    public static void main(String[] args){
        Node root=null;
        int data[]={50,60,30,40,20,90,70};
        for(int i=0;i<data.length;i++)
            root=bst(root,data[i]);

        System.out.println(search(root,20));

    }

}