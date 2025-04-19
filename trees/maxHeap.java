public class maxHeap
{
    static int heap[]=new int[10];
    static int ind=-1;
   
    static void disp(){
        for(int i=0;i<=ind;i++)
            System.out.print(heap[i]+" ");
        System.out.println();
    }
    static void ins_maxheap(int data){ //10
        if(ind<9){ //0
        ind++;
            heap[ind]=data; //10 5
           
            int t=ind;// 1
           
            while(t>0 && heap[t]>heap[(t-1)/2]){ //t 5<10
                heap[t]=heap[t]+heap[(t-1)/2]-(heap[(t-1)/2]=heap[t]);
                t=(t-1)/2;
            }
             //1
        }
        else
            System.out.println("heap is full");
    }
   
    static void del(){
        heap[0]=heap[0]+heap[ind]-(heap[ind]=heap[0]);
        ind--;
       
        heapify(0);
    }
    static void heapify(int i){
        int l=2*i+1;
        int r=2*i+2;
        int s=i;
       
        if(l<=ind && heap[l]>heap[s])
            s=l;
        if(r<=ind && heap[r]>heap[s])
            s=r;
       
        if(s!=i){
            heap[i]=heap[i]+heap[s]-(heap[s]=heap[i]);
            heapify(s);
        }
    }
   
    static void maxsort(){
        int p=ind;
        while(ind>-1){
            del();
        }
        ind=p;
    }
    public static void main(String[] args) {
        ins_maxheap(10);
        ins_maxheap(5);
        ins_maxheap(15);
        ins_maxheap(20);
        ins_maxheap(-15);
        disp();
        maxsort();
        System.out.println("after sorting max heap");
        disp();
    }
}