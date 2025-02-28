public class evenOrOddCount{
    public static int fun(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int even=fun(arr);
        int odd=arr.length-even;
        System.out.println("num of even:"+even);
        System.out.println("num of odd:"+odd);

    }
}