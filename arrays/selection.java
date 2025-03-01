public class selection{
    public static void fun(int arr[],int loc){
    int n=arr.length;
    for(int i=loc;i<n-1;i++){
        int min=i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min])
            min=j;   
            }
    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
        }
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    System.out.println();

    } 
    public static void main(String [] args){
        int arr[]={1,3,5,2,6,4,8,7,9};
        fun(arr,2);


    }
}