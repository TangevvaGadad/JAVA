class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //insertion
    //add first
    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //delete first
    public void deleteFirst(){
        if(head==null)
            System.out.println("LL is empty");
        head=head.next;
    }
//delete last
    public void deleteLast(){
        if(head==null)
            System.out.println("LL is empty");

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node last=head.next;

        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;

        }     
        secondLast.next=null;   
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
         Node currNode=head;
         while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
         }
         System.out.println("NULL");
    }

    public static void main(String[] args){
        LL list=new LL();

        list.addFirst("a");
        list.addFirst("b");
        list.printList();
        list.addLast("c");
        list.addLast("z");
        list.printList();

    }
}