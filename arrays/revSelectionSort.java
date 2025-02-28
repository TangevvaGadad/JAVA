public class revSelectionSort{
    public static void main(String [] args){
        int arr[]={1,3,5,2,6};
        int n=arr.length;

        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j])
                    arr[i]=arr[i]+arr[j]-(arr[j]=arr[i]);
            }
        }
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}