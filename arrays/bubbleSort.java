class bubbleSort{
    public static void fun(int arr[]){
        int temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                while(arr[i]>arr[j]){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
                }
            }
        }
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");


    }
    public static void main(String []args){
        int arr[]={0,0,2,8,1,7,4,9};
        fun(arr);

    }

}