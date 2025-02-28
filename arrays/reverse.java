// public class reverse{
//     public static int fun(int arr[]){
//         int barr[]=new int [arr.length];
//         for(int i=0;i<arr.length;i++){
//                 barr[i]=arr[arr.length-1-i];
//                         System.out.print(barr[i]+" ");
//         }
  
//         return 0;
//     }
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5};
//         fun(arr);

//     }
// }






class reverse{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }

}