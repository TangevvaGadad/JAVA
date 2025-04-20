class heap{
    ArrayList<Integer> heap=new ArrayList<>();
    Heap(){
        heap=new ArrayList<>();
        heap.add(null);
    }

    int parent(int i){
        return i/2;
    }
    int leftChild(int i){
        return 2*i;
    }
    int rightChild(int i){
        return 2*i+1;
    }
    int swap(int[] arr,int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }

    void heapifyup_max(ArrayList<Integer> arr,int i){
        while(i>1){
            if(arr.get(i)>arr.get(parent(i))){
                int temp=arr.get(i);
                arr.set(i,arr.get(parent(i)));
                arr.set(parent(i),temp);
            }
            else{
                break;
            }
            i=parent(arr.get(i))(i);
        }

    }


    void heapifydown(ArrayList<Integer> arr,){
        int smallest=i;
        int left=leftChild(i);
        int right=rightChild(i);

        if(left<arr.size() && arr.get)

        if(smallest!=i){
            int temp=arr.get(i);
            arr.set(i,arr.get(smallest));
            arr.set(smallest,temp);
            heapifydown(arr,smallest);
        }
    }

    int remove(){
        this.heap.set(1,this.heap.size());
        this.heap.remove(this.heap.size()-1);
        heapifyup_max(this.heap,1);
        return root;
    }
    public static void main(String args[]){

    }
}