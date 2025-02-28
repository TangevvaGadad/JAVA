import java.util.Scanner;
public class maxOrMin{
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];

        }
        return max;
    }
        public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];

        }
        return min;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int [n];

        System.out.println("Enter number:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println("max:"+max(arr));
        System.out.println("min:"+min(arr));

        sc.close();

    }
}