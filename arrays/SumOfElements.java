public class SumOfElements{
    public static int fun(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res+arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(fun(arr));

    }
}