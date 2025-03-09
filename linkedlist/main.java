
public class main
{
public static void main(String[] args) {
LinkedList l=new LinkedList();

l.append(90);
l.append(65);
l.append(32);
l.append(97);
// l.disp();

//System.out.println(l.root.add.add.data);
System.out.println("Bubble Sorted:");
l.bubbleSort();
}
}

class LinkedList{
Node root;
int count(int key){
int c=0;
if(root==null)
return c;

Node x=root;
while(x!=null){
if(key==x.data)
c+=1;
x=x.add;
}
return c;
}
void append(int data){
Node t=new Node(data);
if(root==null){
root=t;
return;
}
Node x=root;
while(x.add!=null)
x=x.add;//jumping state
x.add=t;
return;
}
void disp(){
if(root==null){
System.out.println("nothing");
return;
}
Node x=root;
System.out.println("data | add");
System.out.println("*******************");
while (x!=null){
System.out.println(x.data+" |"+x.add);
x=x.add;
}
}
int len(){
if(root==null){
return 0;
}
Node x=root;
int i=0;
while(x!=null){
i+=1;
x=x.add;
}
return i;
}
void delete(int ind){
if(root==null){
System.out.println("can't delete");
return;
}
int n=this.len();
if (ind<0)
ind=0;
if (ind>n-1)
ind=n-1;

Node x=root;
if(ind==0){
root=x.add;
x.add=null;
return;
}
while(ind!=1){
x=x.add;
ind-=1;
}
Node y=x.add;
x.add=y.add;
y.add=null;
return;
}
int search(int key){
if(root==null)
return -1;
int i=0;
Node x=root;
while(x!=null){
if(key==x.data)
return i;
i+=1;
x=x.add;
}
return -1;
}

void sort(){
    if(root==null)
        return;
    for(Node i=root;i!=null;i=i.add){
        for(Node j=i.add;j!=null;j=j.add){
            if(i.data>j.data){
                int temp=i.data;
                i.data=j.data;
                j.data=temp;
            }

        }
    }
    disp();
}

void bubbleSort(){
    if(root==null)
        return;
    for(Node i=root;i!=null;i=i.add){
        for(Node j=root;j.add!=null;j=j.add){
            if(j.data>j.add.data){
                int temp=j.data;
                j.data=j.add.data;
                j.add.data=temp;
            }

        }
    }
    disp();

}
}

class Node{
int data;
Node add;
Node(int data){
this.data=data;
}
}