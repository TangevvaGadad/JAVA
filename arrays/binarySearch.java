class binarySearch{
    public static int fun(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(x==arr[mid])
                return mid;
            if(x>arr[mid])
                low=mid+1;
            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String []args){
        int arr[]={1,2,3,4,5};
        int res=fun(arr,5);
        if(res==-1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at:"+res);
    }
}